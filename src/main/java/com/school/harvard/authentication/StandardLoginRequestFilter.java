package com.school.harvard.authentication;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.AuthenticationServiceException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;



public class StandardLoginRequestFilter extends UsernamePasswordAuthenticationFilter {

	public StandardLoginRequestFilter(String path, AuthenticationManager authManager, AuthSuccessHandler authenticationResultHandler) {
		super();
		setAuthenticationManager(authManager);
		setAuthenticationSuccessHandler(authenticationResultHandler);
		setFilterProcessesUrl(path);
	}
	
	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response) throws AuthenticationException {
		if (!request.getMethod().equals("POST")) {
			throw new AuthenticationServiceException(
					"Authentication method not supported: " + request.getMethod());
		}

		String username = obtainUsername(request);
		String password = obtainPassword(request);

		if (username == null) {
			username = "";
		}

		if (password == null) {
			password = "";
		}

		username = username.trim();

		StandardAuthenticationToken authRequest = new StandardAuthenticationToken(
				username, password);

		authRequest.setDetails("STANDARD"/*AuthType.STANDARD*/);

		return this.getAuthenticationManager().authenticate(authRequest);
	}

}
