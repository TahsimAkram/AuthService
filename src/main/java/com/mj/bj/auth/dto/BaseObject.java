package com.mj.bj.auth.dto;

import java.io.Serializable;
import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseObject implements Serializable {
	private int id;
	private int aucSubRuleId;
	private int createUserId;
	private Timestamp createDate;
	private int updateUserId;
	private Timestamp updateDate;
	private StatusObject status;
	private String auctionstatus;
	private String code;
	private String email;
	private String market;
	private int subRoleId;
	private int firstTimeLogin;
	private String branch;
	private String featureList;
	private int stage;
	private int aucruleId;
	private String cin;
	String orgIdPan;
	String orgIdUdyam;
	
}
