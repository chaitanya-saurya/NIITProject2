package com.niit.UserBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.UserBoot.dao.CircleDao;
import com.niit.UserBoot.dao.UserCircleDao;
@Service
public class UserCircleServiceImpl implements UserCircleService {
	@Autowired  
    private UserCircleDao usercircledao;

	@Override
	public boolean addUserToCircle(String emailId, String circleName) {
		// TODO Auto-generated method stub
		return usercircledao.addUserToCircle(emailId, circleName);
	}

	@Override
	public boolean deleteUserfromCircle(String emailId, String circleName) {
		// TODO Auto-generated method stub
		return usercircledao.deleteUserfromCircle(emailId, circleName);
	}

	@Override
	public List<String> getUsersofCircle(String circleName) {
		// TODO Auto-generated method stub
		return usercircledao.getUsersofCircle(circleName);
	}

}
