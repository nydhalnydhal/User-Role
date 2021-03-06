package com.nydhal.users.service;

import com.nydhal.users.entities.Role;
import com.nydhal.users.entities.User;

public interface UserService {
	User saveUser(User user);
	User findUserByUsername (String username);
	Role addRole(Role role);
	User addRoleToUser(String username, String rolename);
	
}
