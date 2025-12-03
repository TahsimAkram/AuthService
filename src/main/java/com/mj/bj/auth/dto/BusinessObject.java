package com.mj.bj.auth.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BusinessObject extends BaseObject {
	private OrganizationObject organization;
	private String description;
	private String label;
	private String path;
	private String comment;
	private DefaultUserObject ownerUser;
	private DefaultUserObject createUser;
	private DefaultUserObject updateUser;
	private String rfqItemId;
	private int  productSubCategoryId;
}
