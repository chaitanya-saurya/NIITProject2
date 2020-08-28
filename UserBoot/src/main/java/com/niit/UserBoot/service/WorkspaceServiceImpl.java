package com.niit.UserBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.UserBoot.dao.WorkspaceDao;
import com.niit.UserBoot.model.Workspace;
@Service
public class WorkspaceServiceImpl implements WorkspaceService {
	@Autowired  
    private WorkspaceDao workspacedao; 
	@Override
	public boolean createWorkspace(Workspace workspace) {
		// TODO Auto-generated method stub
		return workspacedao.createWorkspace(workspace);
	}

	@Override
	public List<Workspace> getWorkspaceByAdminEmailId(String emailId) {
		// TODO Auto-generated method stub
		return workspacedao.getWorkspaceByAdminEmailId(emailId);
	}

}
