package com.mj.bj.auth.dto;

import lombok.Data;

@Data
public class RoleObject extends BaseObject {
	private String roleDescription;
	private int subRoleId;
	private int roleOwnerId;

}
