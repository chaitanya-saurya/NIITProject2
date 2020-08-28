package com.niit.UserBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.UserBoot.dao.CircleDao;
import com.niit.UserBoot.model.Circle;
@Service
public class CircleServiceImpl implements CircleService {
	
	@Autowired  
    private CircleDao circledao;  

	@Override
	public boolean addCircle(Circle circle) {
		// TODO Auto-generated method stub
		return circledao.addCircle(circle) ;
	}

	@Override
	public boolean deleteCircle(String emailId, String circleName) {
		// TODO Auto-generated method stub
		return circledao.deleteCircle(emailId,circleName);
	}

	@Override
	public List<Circle> getAllCircles() {
		// TODO Auto-generated method stub
		return circledao.getAllCircles();
	}

	@Override
	public List<Circle> getCircleByUser(String emailId) {
		// TODO Auto-generated method stub
		return circledao.getCircleByUser(emailId);
	}

	@Override
	public Circle getCircleByName(String CircleName) {
		// TODO Auto-generated method stub
		return circledao.getCircleByName(CircleName);
	}

}
