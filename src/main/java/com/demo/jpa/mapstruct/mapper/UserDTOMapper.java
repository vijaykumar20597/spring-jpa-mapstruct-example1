package com.demo.jpa.mapstruct.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.demo.jpa.mapstruct.dto.UserDTO;
import com.demo.jpa.mapstruct.model.User;

@Mapper(componentModel = "spring")
public interface UserDTOMapper {
	
	@Mapping(target = "age", source = "userAge")
	@Mapping(target = "city", constant = "Hyderabad")
	UserDTO touserDTO(User user);
	
	User toUser(UserDTO userDTO);
	
	List<UserDTO> toUserDTO(List<User> users);
}
