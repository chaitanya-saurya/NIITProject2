package com.niit.UserBoot.service;

import java.util.List;

import com.niit.UserBoot.model.Message;

public interface MessageService {
	boolean sendMessage(Message message);
	List<Message> getMyMessages(String emailId);

}
