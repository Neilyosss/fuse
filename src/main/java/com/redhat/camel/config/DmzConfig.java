package com.redhat.camel.config;

import java.util.Map;

import javax.persistence.EntityManager;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateProperties;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateSettings;
import org.springframework.boot.autoconfigure.orm.jpa.JpaProperties;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "entityManagerFactoryDmz", transactionManagerRef = "transactionManagerDmz", basePackages = {
		"com.redhat.camel.dmzDao" }) // 设置Repository所在位置
public class DmzConfig {
	@Autowired
	@Qualifier("dmzDataSource")
	private DataSource dmzDataSource;

	@Autowired
	private JpaProperties jpaProperties;
	@Autowired
	private HibernateProperties hibernateProperties;

	private Map<String, Object> getVendorProperties() {
		return hibernateProperties.determineHibernateProperties(jpaProperties.getProperties(), new HibernateSettings());
	}

	@Bean(name = "entityManagerDmz")
	public EntityManager entityManager(EntityManagerFactoryBuilder builder) {
		return entityManagerFactoryDmz(builder).getObject().createEntityManager();
	}

	@Bean(name = "entityManagerFactoryDmz")
	public LocalContainerEntityManagerFactoryBean entityManagerFactoryDmz(EntityManagerFactoryBuilder builder) {
//	        HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
//	        jpaVendorAdapter.setGenerateDdl(true);
		return builder.dataSource(dmzDataSource).packages("com.redhat.camel.dmzEntity") // 设置实体类所在位置
				.persistenceUnit("dmzPersistenceUnit").properties(getVendorProperties()).build();
	}

	@Bean(name = "transactionManagerDmz")
	public PlatformTransactionManager transactionManagerScimd(EntityManagerFactoryBuilder builder) {
		return new JpaTransactionManager(entityManagerFactoryDmz(builder).getObject());
	}
}
