package com.mj.bj.auth.dto;

import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserSignInSessionObject implements Serializable {
	private AuthenticationObject userAuthentication;
	private HashMap userAccessMap;
	private TreeMap userDocumentMap;
	private List accessUrlList;
}
