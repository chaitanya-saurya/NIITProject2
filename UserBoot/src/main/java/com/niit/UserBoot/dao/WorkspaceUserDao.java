package com.niit.UserBoot.dao;

public interface WorkspaceUserDao {
	boolean sendInvitation(String companyName, String userEmailId);
	boolean acceptInvitation(String companyName, String userEmailId);
	boolean rejectInvitation(String companyName, String userEmailId);
	boolean removeUserFromWorkspace(String companyName, String userEmailId);

}
