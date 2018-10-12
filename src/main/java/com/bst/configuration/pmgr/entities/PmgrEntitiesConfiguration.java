package com.bst.configuration.pmgr.entities;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.bst.pmgr.entities.Work;
import com.bst.pmgr.entities.components.WorkListener;
import com.bst.pmgr.entities.configuration.RepositoryConfig;
import com.bst.pmgr.entities.repositories.WorkRepository;
import com.bst.pmgr.entities.schema.SchemaService;

@Configuration
@EntityScan(basePackageClasses = { Work.class })
@EnableJpaRepositories(basePackageClasses = { WorkRepository.class })
@EnableTransactionManagement
@EnableJpaAuditing
@EnableAspectJAutoProxy
@EnableAutoConfiguration
@ComponentScan(basePackageClasses = { WorkListener.class, SchemaService.class, RepositoryConfig.class })
public class PmgrEntitiesConfiguration {

}
