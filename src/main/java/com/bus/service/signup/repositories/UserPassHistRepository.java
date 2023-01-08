package com.bus.service.signup.repositories;

import com.bus.service.signup.models.UserPassHist;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserPassHistRepository extends JpaRepository<UserPassHist,Long> {
    //provides a mechanism to find and perform other CRUD operations on the User Password History data
}
