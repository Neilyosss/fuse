/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.redhat.camel;

import org.apache.camel.spring.boot.CamelSpringBootApplicationController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
//import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ImportResource;

//CHECKSTYLE:OFF
/**
 * A sample Spring Boot application that starts the Camel routes.
 */
@SpringBootApplication
// load the spring xml file from classpath
@ImportResource("classpath:camel-context.xml")
//public class SampleCamelApplication extends org.springframework.boot.web.support.SpringBootServletInitializer{
	public class SampleCamelApplication extends SpringBootServletInitializer{
	
    @Bean(name="CamelServlet")
    public ServletRegistrationBean servletRegistrationBean() {
        return new ServletRegistrationBean(new org.apache.camel.component.servlet.CamelHttpTransportServlet(), "/*");// ServletName默认值为首字母小写，即myServlet
    }
	
	
	 com.fasterxml.jackson.databind.SerializationConfig l;
	@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(SampleCamelApplication.class);
    }
	
	
    /**
     * A main method to start this application.
     */
    public static void main(String[] args) {
    	ApplicationContext applicationContext = new SpringApplication(SampleCamelApplication.class).run(args);
        CamelSpringBootApplicationController applicationController =
                applicationContext.getBean(CamelSpringBootApplicationController.class);
        applicationController.run();
    }
}
//CHECKSTYLE:ON