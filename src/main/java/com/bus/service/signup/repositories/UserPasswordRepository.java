package com.bus.service.signup.repositories;

import com.bus.service.signup.models.UserPassword;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPasswordRepository extends JpaRepository<UserPassword,Long> {
    //provides a mechanism to find and perform other CRUD operations on the User Password data
}
