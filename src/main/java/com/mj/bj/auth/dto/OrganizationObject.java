package com.mj.bj.auth.dto;

import lombok.Data;

@Data
public class OrganizationObject extends BaseObject {

	private String organizationName;
	private String organizationUrl;
	private String sapCode;
	private OrganizationTypeObject organizationType;
	private DefaultUserObject organizationUser;
	private DefaultContactObject organizationContact;
	private String organizationUserAuthentication;
	private String organizationUserAuthenticationOrganization;
	private String organizationUserAuthenticationStatus;
	private String clientType;
	private String shortName;
	private int organizationId=0;
	private int estdyear=0;
	private int manpower=0;
	private String location;
	private String pan;
	private String cin;
    private String branch;
	
	private String organizationBranch;
    private String organizationIds;
    private int userId;
    
    private int auctionNoticeId;
    
    private String udyamLocation;
	private String udyamNo;
    private String udyamFileExt;
    private String isMsme;
    
    String projectId;
}
