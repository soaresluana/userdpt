package com.springproject.userdpt.repositories;

import com.springproject.userdpt.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
