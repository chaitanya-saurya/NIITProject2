package com.niit.UserBoot.dao;

import com.niit.UserBoot.model.Message;
import java.util.List;

public interface MessageDao {
	boolean sendMessage(Message message);
	List<Message> getMyMessages(String emailId);

}
