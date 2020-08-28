package com.niit.UserBoot.dao;

import java.util.List;

import com.niit.UserBoot.model.Workspace;

public interface WorkspaceDao {
       boolean createWorkspace(Workspace workspace); 
       List<Workspace> getWorkspaceByAdminEmailId (String emailId);
       
}
