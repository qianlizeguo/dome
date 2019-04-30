package com.example.demo.repositoryImpl;

import com.example.demo.repository.AnswerRepositoryCustom;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class AnswerRepositoryImpl implements AnswerRepositoryCustom {

	@PersistenceContext
	private EntityManager em;
}
