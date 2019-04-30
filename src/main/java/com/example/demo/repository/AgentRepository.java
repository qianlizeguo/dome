package com.example.demo.repository;

import com.example.demo.entity.Agent;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AgentRepository extends JpaRepository<Agent, Integer>, AgentRepositoryCustom {
}
