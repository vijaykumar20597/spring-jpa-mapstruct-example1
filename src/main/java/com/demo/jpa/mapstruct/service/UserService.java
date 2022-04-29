package com.demo.jpa.mapstruct.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.jpa.mapstruct.model.User;
import com.demo.jpa.mapstruct.repository.UserRepository;

@Service
public class UserService {

	@Autowired
	UserRepository userRepository;

	public void save(User user) {

		userRepository.save(user);
	}

	public List<User> findAll() {

		return userRepository.findAll();
	}

}
