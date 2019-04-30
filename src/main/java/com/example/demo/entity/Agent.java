package com.example.demo.entity;

import java.io.Serializable;

import javax.persistence.*;

/**
 * 代理商表
 */
@Entity
@Table(name = "agent")
public class Agent implements Serializable {

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
	@Column(name = "uid", nullable = true, length = 11)
	private Integer uid;

	/**
	 * 上一级uid
	 * default value: 0
	 */
	@Column(name = "pid", nullable = true, length = 11)
	private Integer pid;

	/**
	 * 代理级别
	 * default value: 1
	 */
	@Column(name = "grade", nullable = true, length = 1)
	private Boolean grade;

	/**
	 * 时间
	 * default value: null
	 */
	@Column(name = "dateline", nullable = true, length = 32)
	private java.util.Date dateline;

	/**
	 * 合伙人id
	 * default value: 0
	 */
	@Column(name = "partnerId", nullable = false, length = 11)
	private Integer partnerid;
	
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
	
	public Integer getPid() {
		return this.pid;
	}
	
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	
	public Boolean getGrade() {
		return this.grade;
	}
	
	public void setGrade(Boolean grade) {
		this.grade = grade;
	}
	
	public java.util.Date getDateline() {
		return this.dateline;
	}
	
	public void setDateline(java.util.Date dateline) {
		this.dateline = dateline;
	}
	
	public Integer getPartnerid() {
		return this.partnerid;
	}
	
	public void setPartnerid(Integer partnerid) {
		this.partnerid = partnerid;
	}
}
