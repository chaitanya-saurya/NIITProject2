package com.niit.UserBoot.service;

import java.util.List;

import com.niit.UserBoot.model.Workspace;

public interface WorkspaceService {
	boolean createWorkspace(Workspace workspace); 
    List<Workspace> getWorkspaceByAdminEmailId (String emailId);

}
