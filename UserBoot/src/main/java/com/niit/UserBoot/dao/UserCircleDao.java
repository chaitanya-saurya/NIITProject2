package com.niit.UserBoot.dao;

import java.util.List;

public interface UserCircleDao {
	boolean addUserToCircle(String emailId, String circleName);
	boolean deleteUserfromCircle(String emailId, String circleName);
	List <String> getUsersofCircle(String circleName);
	

}
