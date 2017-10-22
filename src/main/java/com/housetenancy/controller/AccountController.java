package com.housetenancy.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.housetenancy.queryservice.IUserQueryService;
import com.housetenancy.repository.dto.UserDTO;

@Controller
@RequestMapping("/account")
public class AccountController {
	
	public IUserQueryService userQueryService;
	
	public AccountController(IUserQueryService userQueryService) {
		this.userQueryService=userQueryService;
	}

	@RequestMapping("/login")
	public String login() {
		List<UserDTO> list = userQueryService.getAllUserDTO();
		return "account/login";
	}

}
