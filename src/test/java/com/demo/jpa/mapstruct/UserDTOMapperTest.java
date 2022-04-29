package com.demo.jpa.mapstruct;

import org.junit.jupiter.api.Test;

import com.demo.jpa.mapstruct.dto.UserDTO;
import com.demo.jpa.mapstruct.model.User;

public class UserDTOMapperTest {

	@Test
	void ShouldConvertUserFromUserDTO() {

		User user = new User();

		user.setFirstName("vijay");
		user.setLastName("chintala");
		user.setUserAge(25);

		UserDTO userDTO = new UserDTO();

		userDTO.setFirstName(user.getFirstName());
		userDTO.setLastName(user.getLastName());
		userDTO.setAge(user.getUserAge());
		userDTO.setCity("Hyderabad");

//		assertEquals(user.getFirstName(), userDTO.getFirstName());
//		assertEquals(user.getLastName(), userDTO.getLastName());
//		assertEquals(user.getUserAge(), userDTO.getAge());
//		assertEquals("Hyderabad", userDTO.getCity());

	}
}
