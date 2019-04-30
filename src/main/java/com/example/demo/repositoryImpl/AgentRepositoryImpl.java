package com.example.demo.repositoryImpl;

import com.example.demo.repository.AgentRepositoryCustom;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class AgentRepositoryImpl implements AgentRepositoryCustom {

	@PersistenceContext
	private EntityManager em;
}
