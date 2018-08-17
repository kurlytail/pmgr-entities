package com.bst.configuration;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan({"com.bst.pmgr.generic.entities", "com.bst.pmgr.entities"})
@EnableJpaRepositories("com.bst.pmgr.repositories")
public class LibConfig {

}
