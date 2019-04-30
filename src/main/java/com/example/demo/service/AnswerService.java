package com.example.demo.service;

import com.example.demo.entity.Answer;
import com.example.demo.repository.AnswerRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class AnswerService  {

	@Resource
	private AnswerRepository answerRepository;

    /**
     * 分页获取数据
     */
    public Page<Answer> getListByPage(int start, int pageSize)
    {
        start = start < 0 ? 0:start;
        Sort sort = new Sort(Sort.Direction.DESC,"id"); //设置根据id倒序排列
        Pageable pageable = new PageRequest(start, pageSize,sort); //根据start、size、sort创建分页对象
        Page<Answer> page = answerRepository.findAll(pageable);    //根据这个分页对象获取分页对象

        // System.out.println(page.getNumber());  //当前页start
        // System.out.println(page.getNumberOfElements());  //当前页start
        // System.out.println(page.getSize());   //每页数量size
        // System.out.println(page.getTotalElements());  //总数量
        // System.out.println(page.getTotalPages());    //总页数

        return page;
    }
}
