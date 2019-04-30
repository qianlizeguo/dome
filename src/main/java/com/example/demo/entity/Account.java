package com.example.demo.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "account")
public class Account  implements Serializable {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;

	private Long cid;

	private Long uid;

	private Long type;

	private String openid;

	private String unionid;

	private String channel;

	private java.util.Date dateline;

	private String mobile;

	private String password;

	@Column(name = "mpOpenid")
	private String mpOpenid;

	private String city;

	private String province;

}
