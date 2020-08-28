package com.niit.UserBoot.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.niit.UserBoot.model.Circle;

public interface CircleService {
	boolean addCircle(Circle circle);
	boolean deleteCircle(String emailId, String circleName);
	List <Circle> getAllCircles();
	List <Circle> getCircleByUser(String emailId);
	Circle getCircleByName(String CircleName);

}
