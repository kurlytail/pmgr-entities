package com.bst.application.pmgr.entities;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.bst.configuration.pmgr.entities.PmgrEntitiesConfiguration;
import com.bst.utility.components.AuditService;

@SpringBootApplication
@ComponentScan(basePackageClasses = { PmgrEntitiesConfiguration.class, Application.class })
@EnableTransactionManagement
public class Application extends SpringBootServletInitializer {

	public static void main(final String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public AuditService getAuditService() {
		return new AuditService();
	}

}