package com.sudin.service;

import java.util.Arrays;
import java.util.HashSet;

import com.sudin.Model.Role;
import com.sudin.Model.Users;
import com.sudin.Repository.RoleRepository;
import com.sudin.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService{

	@Qualifier("userRepository")
	@Autowired
	private UserRepository userRepository;
	@Qualifier("roleRepository")
	@Autowired
    private RoleRepository roleRepository;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Override
	public Users findUserByEmail(String email) {
		return userRepository.findByEmail(email);
	}

	@Override
	public void saveUser(Users users) {
		users.setPassword(bCryptPasswordEncoder.encode(users.getPassword()));
        users.setActive(1);
        Role userRole = roleRepository.findByRole("ADMIN");
        users.setRoles(new HashSet<>(Arrays.asList(userRole)));
		userRepository.save(users);
	}

}
