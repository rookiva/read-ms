package com.bservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cdao.IreadDao;
import com.domain.User;

@Service
@Transactional
public class ReadServiceImpl implements IreadService {
	
	@Autowired
	private IreadDao userDaoImpl;	

	/* Select all records */
	@Override
	public List<User> findAllUser() {
		List<User> userList = userDaoImpl.findAll();
	    
	    System.out.println("All records retrieved!!!");

		return userList;	
	}

	@Override
	public String toString() {
		return "ReadServiceImpl";
	}

}