package com.mj.bj.auth.dto;

import lombok.Data;

@Data
public class UserObject extends DefaultUserObject {
	private OrganizationObject userOrganization;
	private UserTypeObject userType;
	private RoleObject userRole;
}
