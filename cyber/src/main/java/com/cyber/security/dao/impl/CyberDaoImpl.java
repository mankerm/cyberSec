package com.cyber.security.dao.impl;

import java.sql.Types;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cyber.security.dao.CyberDao;
import com.cyber.security.model.User;

@Repository
public class CyberDaoImpl implements CyberDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	String sqlInsert = "INSERT INTO CYBER(USERNAME,PASSWORD) VALUES (? ,?) ";

	@Override
	public int registerUser(User user) {
		
		Object[] params = new Object[] {user.getUserName(), user.getUserPassword()};    
		int[] types = new int[] { Types.VARCHAR, Types.VARCHAR};    
		return jdbcTemplate.update(sqlInsert, params, types);
		
	}

}
