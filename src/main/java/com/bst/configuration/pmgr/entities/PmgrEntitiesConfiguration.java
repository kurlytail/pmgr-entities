package com.bst.configuration.pmgr.entities;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EntityScan({"com.bst.pmgr.entities.generic", "com.bst.pmgr.entities"})
@EnableJpaRepositories("com.bst.pmgr.entities.repositories")
//@ImportResource({"classpath:Aspect.xml"})
@EnableTransactionManagement
@EnableJpaAuditing
@EnableAspectJAutoProxy
@EnableAutoConfiguration
public class PmgrEntitiesConfiguration {

}
