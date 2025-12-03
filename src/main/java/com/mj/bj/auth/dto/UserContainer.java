package com.mj.bj.auth.dto;

import java.util.Locale;

import jakarta.servlet.http.HttpSessionBindingListener;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserContainer implements HttpSessionBindingListener {
	private Locale locale;
	private UserSignInSessionObject userSignInSessionObject;
}
