package com.niit.UserBoot.service;

import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.UserBoot.dao.UserDao;
import com.niit.UserBoot.model.User;
@Service
public class UserServiceImpl implements UserService {
	@Autowired  
    private com.niit.UserBoot.dao.UserDao userdao; 
	
	public static List<User> users;
	public UserServiceImpl() {
		users=new LinkedList<>();
	}
	
	@Override
	public boolean save(User user) {
		// TODO Auto-generated method stub
		return userdao.save(user);
	}

	@Override
	public boolean update(User user) {
		// TODO Auto-generated method stub
		return userdao.update(user);
	}

	@Override
	public User get(String id) {
		return userdao.get(id);
//		return users.stream()
//				.filter(x -> x.getUserId() == id)
//				.findAny()
//				.orElse(new User(0,"Not Available"));
		
	}

	@Override
	public List<User> list() {
		// TODO Auto-generated method stub
		return userdao.list();
	}

	@Override
	public User validate(String id, String password) {
		// TODO Auto-generated method stub
		return userdao.validate(id, password);
	}

}
