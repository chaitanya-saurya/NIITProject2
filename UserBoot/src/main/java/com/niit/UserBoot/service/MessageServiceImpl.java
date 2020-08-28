package com.niit.UserBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.UserBoot.dao.MessageDao;
import com.niit.UserBoot.model.Message;
@Service
public class MessageServiceImpl implements MessageService {
	@Autowired  
    private MessageDao messagedao;

	@Override
	public boolean sendMessage(Message message) {
		// TODO Auto-generated method stub
		return messagedao.sendMessage(message);
	}

	@Override
	public List<Message> getMyMessages(String emailId) {
		// TODO Auto-generated method stub
		return messagedao.getMyMessages(emailId);
	}

}
