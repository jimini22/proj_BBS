package com.bd.domain;

import java.util.Date;

import lombok.Data;

@Data
public class BoardDTO {

	private Long board_no;
	private String title;
	private String content;
	private Date reg_dt;
	private Date modi_dt;
	private Long user_no;
	
}
