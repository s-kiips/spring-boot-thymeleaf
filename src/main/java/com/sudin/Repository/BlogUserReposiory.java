package com.sudin.Repository;

import com.sudin.Model.BlogUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Sudin Ranjitkar on 5/18/2017.
 */
@Repository
public interface BlogUserReposiory extends JpaRepository<BlogUser,Long> {
}
