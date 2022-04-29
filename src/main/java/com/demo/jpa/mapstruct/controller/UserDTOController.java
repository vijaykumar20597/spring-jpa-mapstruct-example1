package com.demo.jpa.mapstruct.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.demo.jpa.mapstruct.dto.UserDTO;
import com.demo.jpa.mapstruct.mapper.UserDTOMapper;
import com.demo.jpa.mapstruct.model.User;
import com.demo.jpa.mapstruct.service.UserService;

@RestController
public class UserDTOController {

	@Autowired
	UserService userService;
	
	@Autowired
	UserDTOMapper userDTOMapper;

	@PostMapping("/postUser")
	public void postUser(@RequestBody UserDTO userDTO) {

		User user = userDTOMapper.toUser(userDTO);
		
		userService.save(user);

	}

	@GetMapping("/getUser")
	public List<UserDTO> getUser() {

		List<User> users =  userService.findAll();
		
		return userDTOMapper.toUserDTO(users);		

	}
}
