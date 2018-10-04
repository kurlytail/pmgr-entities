package com.bst.pmgr.entities;

import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;

import com.bst.pmgr.entities.audit.ActivityAudit;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@EntityListeners(ActivityAudit.class)
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "activityType")
@ToString
@Getter
@EqualsAndHashCode
public class Activity {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;

	@Setter
	private String name;
	
	@Setter
	private String metaName;
    
	@ManyToOne
	private Work work;
}
