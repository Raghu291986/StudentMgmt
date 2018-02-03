package com.school.harvard.authentication;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

/*Class extends org.springframework.security.web.AuthenticationEntryPoint, and 
implements only one method, which sends response error (with 401 status code) in cause of unauthorized attempt.*/
@Component
public class HttpAuthenticationEntryPoint implements AuthenticationEntryPoint {
    @Override
    public void commence(HttpServletRequest request, HttpServletResponse response,
            AuthenticationException authException) throws IOException {
    	System.out.println("netry point failure..");
    //	response.sendError(HttpServletResponse.SC_UNAUTHORIZED, authException.getMessage());
    }
}
