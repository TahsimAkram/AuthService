package com.mj.bj.auth.dto;

import java.sql.Timestamp;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AuthenticationObject extends BaseObject {
	private String authenticationUserCode;
	private String authenticationUserPassword;
	private String decryptedPassword;
	private String IP;
	private Timestamp serverTime = new Timestamp(System.currentTimeMillis()); // SAIKAT for Server time sync.
	private OrganizationObject authenticationOrganization;
	private UserObject authenticationUser;
	private AuthenticationUserOrganizationCategoryTypeObject authenticationUserOrganizationCategoryType;
	private String pan;
	private String CIN;
    private String userStatus;
    private String projectId;
    private int userId;
    private int pwdExpiredTimeInDays;
    private String jwtToken;
	private int allowAuthenticationCode;
	private String authenticationMsg;
	private int exception_user;
}
