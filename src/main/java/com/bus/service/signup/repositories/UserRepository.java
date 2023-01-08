package com.bus.service.signup.repositories;

import com.bus.service.signup.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
    //provides a mechanism to find and perform other CRUD operations on the user data
}
