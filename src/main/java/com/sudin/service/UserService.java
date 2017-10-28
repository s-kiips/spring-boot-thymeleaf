package com.sudin.service;


import com.sudin.Model.Users;

public interface UserService {

    Users findUserByEmail(String email);

    void saveUser(Users users);
}
