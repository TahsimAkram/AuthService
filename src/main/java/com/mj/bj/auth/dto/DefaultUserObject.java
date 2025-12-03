package com.mj.bj.auth.dto;

import java.sql.Timestamp;
import java.util.Set;

import lombok.Data;

@Data
public class DefaultUserObject extends BaseObject {
	private String userSalutation;
	private String userFirstName;
	private String userLastName;
	private String userMail;
	private String authenticationCode;
	private int authenticationOrganizationId;
	//added later due to auction notice
	private String mobile = null;
	private String phone = null;
	private String activationStatus = null;
	private Timestamp serverTime = new Timestamp(System.currentTimeMillis());
	private int organizationId=0;
	private String authenticationStatus = null;
	private String fax;
	private String address = null;
	private String branch = null;
	private int userId = 0;
	private int usercode=0;
	private String pan=null;
	private String cin=null;
	private String existenceCheckFlag="NA";
	private String mappedUserPan=null;
	private String mappedUserCin=null;
	private String mappedUserOrganizationName=null;
	private String mappedUserBranch = null;	
	
	private String suppCode;
	private String suppBranch;
	private String suppName;
	private Set<String> additionalInfo;
	private String vendorType;
	
	private String isMsme;
    private String udyamNo;
    private String udyamLocation;
    private String userOrgId;
}
