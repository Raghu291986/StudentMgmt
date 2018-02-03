package com.school.harvard.authentication;

import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;

@Component
public class AuthFailureHandler extends SimpleUrlAuthenticationFailureHandler{
	 @Override
	    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response,
	            AuthenticationException exception) throws IOException, ServletException {
	        response.setStatus(HttpServletResponse.SC_UNAUTHORIZED);
System.out.println("inside auth failure..");
	        PrintWriter writer = response.getWriter();
	        writer.write(exception.getMessage());
	        writer.flush();
	    }
}
