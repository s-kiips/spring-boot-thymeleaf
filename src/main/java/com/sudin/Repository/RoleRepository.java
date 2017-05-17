package com.sudin.Repository;

/**
 * Created by Sudin Ranjitkar on 5/17/2017.
 */
import com.sudin.Model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository("roleRepository")
public interface RoleRepository extends JpaRepository<Role, Integer>{
    Role findByRole(String role);

}