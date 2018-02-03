package com.school.harvard.authentication;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.encoding.ShaPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    private final static String USER_TEST = "root";

   // private final LoggedInChecker loggedInChecker;

    @Autowired
    UserServiceImpl(/*LoggedInChecker loggedInChecker*/) {
      System.out.println("logged in...");
    	//  this.loggedInChecker = loggedInChecker;
    }

    @Override
    public User getUserByUsername(String username) {
        // Just a mock interface support only one single root
        // Here you can add DAO to load user from the database
        if (username.equals(USER_TEST)) {
            User user = new User();
            user.setLogin(USER_TEST);
            user.setPassword(new ShaPasswordEncoder().encodePassword("password", null));

            return user;
        } else {
            return null;
        }
    }

    @Override
    public List<String> getPermissions(String username) {
        return new ArrayList<>();
    }

	@Override
	public User getCurrentUser() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean isCurrentUserLoggedIn() {
		// TODO Auto-generated method stub
		return null;
	}

   /* @Override
    public User getCurrentUser() {
        return loggedInChecker.getLoggedInUser();
    }

    @Override
    public Boolean isCurrentUserLoggedIn() {
        return loggedInChecker.getLoggedInUser() != null;
    }*/
}
