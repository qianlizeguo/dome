package com.example.demo.controller;

import com.example.demo.entity.Agent;
import com.example.demo.entity.Answer;
import com.example.demo.repository.AgentRepository;
import com.example.demo.repository.AnswerRepository;
import com.example.demo.service.AnswerService;
import com.example.demo.util.JsonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class HelloController {

    @Autowired
    AgentRepository agentRepository;

    @Autowired
    AnswerRepository answerRepository;

    @Resource
    private AnswerService answerService;

    @RequestMapping("/")
    public String index() {
        return "Greetings from Spring Boot!";
    }

    @RequestMapping("/agent")
    public List<Agent> getAgent() {
        return agentRepository.findAll();
    }

    @RequestMapping("/answer")
    public List<Answer> getAnswer() {
        return answerRepository.findAll();
    }

    @RequestMapping("/answer2")
    public JsonResult listCategory(@RequestParam(value="start",defaultValue="0")int start, @RequestParam(value = "size", defaultValue = "5") int size) throws Exception {
        // System.out.println(start);  //当前页start
        // (new AnswerService()).getListByPage(start, size);
        Page<Answer> page = answerService.getListByPage(start, size);
        for (Answer answer : page) {
            answer.setQuestionName("---" + answer.getQuestionName());
        }

        return new JsonResult(page.getTotalPages(), "请求成功", 0, page.getContent());
    }
}
