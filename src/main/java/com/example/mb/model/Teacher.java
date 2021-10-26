package com.example.mb.model;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Data;

/**
 * TEACHERテーブルのレコードを表すモデルです。
 */
@Data
public class Teacher {

	/** ID */
	private Long id;

	/** 名前 */
	@NotBlank
	@Size(max = 60)
	private String userName;

	/** E-Mail */
	@NotBlank
	@Email
	@Size(max = 254)
	private String email;

}
