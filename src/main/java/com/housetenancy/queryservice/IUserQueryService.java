package com.housetenancy.queryservice;

import java.util.List;

import com.housetenancy.repository.dto.UserDTO;

public interface IUserQueryService {
	UserDTO getUserDTO(String userId);
	List<UserDTO> getAllUserDTO(); 
}
