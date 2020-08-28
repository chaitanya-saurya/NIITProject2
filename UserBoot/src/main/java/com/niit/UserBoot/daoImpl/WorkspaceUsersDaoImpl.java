package com.niit.UserBoot.daoImpl;

import org.springframework.stereotype.Repository;

import com.niit.UserBoot.dao.WorkspaceUserDao;
@Repository(value="workspaceusersDao")
public class WorkspaceUsersDaoImpl implements WorkspaceUserDao {

	@Override
	public boolean sendInvitation(String companyName, String userEmailId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean acceptInvitation(String companyName, String userEmailId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean rejectInvitation(String companyName, String userEmailId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeUserFromWorkspace(String companyName, String userEmailId) {
		// TODO Auto-generated method stub
		return false;
	}

}
