package com.example.demo.service;

import com.example.demo.repository.AgentRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class AgentService  {

	@Resource
	private AgentRepository rep;
}
