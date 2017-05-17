package com.sudin.service;


import com.sudin.Model.User;

public interface UserService {
	public User findUserByEmail(String email);
	public void saveUser(User user);
}
