package com.niit.UserBoot.dao;

import java.util.List;

import com.niit.UserBoot.model.Circle;

public interface CircleDao {
	boolean addCircle(Circle circle);
	boolean deleteCircle(String emailId, String circleName);
	List <Circle> getAllCircles();
	List <Circle> getCircleByUser(String emailId);
	Circle getCircleByName(String CircleName);
}
