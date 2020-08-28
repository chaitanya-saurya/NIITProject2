package com.niit.UserBoot.service;

import java.util.List;

import com.niit.UserBoot.model.User;

public interface UserService {
	public boolean save(User user);
	public boolean update(User user);
	public User get(String id);
	public List<User> list();
	public User validate(String id, String password);

}
