package com.example.codelabpostrgesql.repository;

import com.example.codelabpostrgesql.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}

