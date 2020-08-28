package com.niit.UserBoot.service;

import java.util.List;

public interface UserCircleService {
	boolean addUserToCircle(String emailId, String circleName);
	boolean deleteUserfromCircle(String emailId, String circleName);
	List <String> getUsersofCircle(String circleName);

}
