package com.sudin.service;

import com.sudin.Model.BlogUser;
import com.sudin.Repository.BlogUserReposiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Sudin Ranjitkar on 5/18/2017.
 */
@Service
@Primary
public class BlogUserServiceJpaImpl implements BlogUserService {

    @Autowired
    private BlogUserReposiory blogUserRepo;

    @Override
    public boolean authenticate(String username, String password) {
        return false;
    }

    @Override
    public List<BlogUser> findAll() {
        return this.blogUserRepo.findAll();
    }

    @Override
    public BlogUser findById(Long id) {
        return this.blogUserRepo.findOne(id);
    }

    @Override
    public BlogUser create(BlogUser user) {
        return this.blogUserRepo.save(user);
    }

    @Override
    public BlogUser edit(BlogUser user) {
        return this.blogUserRepo.save(user);
    }

    @Override
    public void deleteById(Long id) {
        this.blogUserRepo.delete(id);
    }
}
