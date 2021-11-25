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
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "entityManagerFactoryProd", transactionManagerRef = "transactionManagerProd", basePackages = {
		"com.redhat.camel.prodDao" }) // 设置Repository所在位置
public class ProdConfig {
	@Autowired
	@Qualifier("prodDataSource")
	private DataSource prodDataSource;

	@Autowired
	private JpaProperties jpaProperties;
	@Autowired
	private HibernateProperties hibernateProperties;

	private Map<String, Object> getVendorProperties() {
		return hibernateProperties.determineHibernateProperties(jpaProperties.getProperties(), new HibernateSettings());
	}

	@Primary
	@Bean(name = "entityManagerProd")
	public EntityManager entityManager(EntityManagerFactoryBuilder builder) {
		return entityManagerFactoryProd(builder).getObject().createEntityManager();
	}

	@Primary
	@Bean(name = "entityManagerFactoryProd")
	public LocalContainerEntityManagerFactoryBean entityManagerFactoryProd(EntityManagerFactoryBuilder builder) {
//	        HibernateJpaVendorAdapter jpaVendorAdapter = new HibernateJpaVendorAdapter();
//	        jpaVendorAdapter.setGenerateDdl(true);
		return builder.dataSource(prodDataSource).packages("com.redhat.camel.prodEntity") // 设置实体类所在位置
				.persistenceUnit("prodPersistenceUnit").properties(getVendorProperties()).build();
	}

	@Primary
	@Bean(name = "transactionManagerProd")
	public PlatformTransactionManager transactionManagerProd(EntityManagerFactoryBuilder builder) {
		return new JpaTransactionManager(entityManagerFactoryProd(builder).getObject());
	}
}
