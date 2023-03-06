package com.atos.management.system.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.atos.management.system.dto.UserRegistrationDto;
import com.atos.management.system.model.User;

public interface UserService extends UserDetailsService{
	User save(UserRegistrationDto registrationDto);
}
