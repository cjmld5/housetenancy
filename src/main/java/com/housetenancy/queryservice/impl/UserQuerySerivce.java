package com.housetenancy.queryservice.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import com.housetenancy.queryservice.IUserQueryService;
import com.housetenancy.repository.dto.UserDTO;

public class UserQuerySerivce implements IUserQueryService {

	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;
	
	@Autowired
	public void setNamedParameterJdbcTemplate(NamedParameterJdbcTemplate namedParameterJdbcTemplate) {
		this.namedParameterJdbcTemplate = namedParameterJdbcTemplate;
	}

	public UserDTO getUserDTO(String userId) {
		return null;
	}

	public List<UserDTO> getAllUserDTO() {
		String sql = "select * from t_user";
		return namedParameterJdbcTemplate.query(sql, new RowMapper<UserDTO>() {
			public UserDTO mapRow(ResultSet rs, int rowNum) throws SQLException {
				UserDTO userDTO=new UserDTO();
				userDTO.setUserId(rs.getString("userid"));
				userDTO.setUserName(rs.getString("username"));
				userDTO.setStatus(rs.getString("status"));
				return null;
			}});
	}
}
