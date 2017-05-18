package com.sudin.service;

import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * Created by Sudin Ranjitkar on 5/18/2017.
 */
@Service
public class BlogUserServiceStubImpl implements BlogUserService {

    @Override
    public boolean authenticate(String username, String password) {
        // Provide a sample password check: username == password
        return Objects.equals(username, password);
    }
}
