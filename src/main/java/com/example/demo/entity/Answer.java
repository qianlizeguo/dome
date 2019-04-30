package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.*;

/**
 * 回答表
 */
@Entity
@Table(name = "answer")
public class Answer implements Serializable {

	/**
	 * null
	 * default value: null
	 */
	@Id
	@Column(name = "id", nullable = false, length = 11)
	private Integer id;

	/**
	 * null
	 * default value: 0
	 */
	@Column(name = "uid", nullable = false, length = 11)
	private Integer uid;

	/**
	 * 选项id
	 * default value: 0
	 */
	@Column(name = "question_id", nullable = false, length = 11)
	private Integer questionId;

	/**
	 * null
	 * default value: null
	 */
	@Column(name = "answer", nullable = false, length = 32)
	private String answer;

	/**
	 * 题目
	 * default value: ''
	 */
	@Column(name = "question_name", nullable = false, length = 128)
	private String questionName;

	/**
	 * 选择的详情
	 * default value: ''
	 */
	@Column(name = "selectContent", nullable = false, length = 255)
	private String selectcontent;
	
	public Integer getId() {
		return this.id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getUid() {
		return this.uid;
	}
	
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	
	public Integer getQuestionId() {
		return this.questionId;
	}
	
	public void setQuestionId(Integer questionId) {
		this.questionId = questionId;
	}
	
	public String getAnswer() {
		return this.answer;
	}
	
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	
	public String getQuestionName() {
		return this.questionName;
	}
	
	public void setQuestionName(String questionName) {
		this.questionName = questionName;
	}
	
	public String getSelectcontent() {
		return this.selectcontent;
	}
	
	public void setSelectcontent(String selectcontent) {
		this.selectcontent = selectcontent;
	}
}
