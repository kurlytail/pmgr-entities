package com.bst.configuration.pmgr.entities;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan({"com.bst.pmgr.entities.generic", "com.bst.pmgr.entities"})
@EnableJpaRepositories("com.bst.pmgr.entities.repositories")
public class PmgrEntitiesConfiguration {

}
