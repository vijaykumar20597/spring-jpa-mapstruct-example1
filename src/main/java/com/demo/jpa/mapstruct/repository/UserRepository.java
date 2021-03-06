package com.demo.jpa.mapstruct.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.jpa.mapstruct.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {


}
