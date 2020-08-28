package com.niit.UserBoot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.UserBoot.dao.UserMessageDao;
import com.niit.UserBoot.model.UserMessage;
@Service
public class UserMessageServiceImpl implements UserMessageService {
	@Autowired  
    private UserMessageDao usermessagedao; 

	@Override
	public boolean sendMessage(UserMessage usermessage) {
		// TODO Auto-generated method stub
		return usermessagedao.sendMessage(usermessage);
	}

	@Override
	public boolean deleteMessage(int messageId) {
		// TODO Auto-generated method stub
		return usermessagedao.deleteMessage(messageId);
	}

	@Override
	public List<UserMessage> getMyMessages(String emailId) {
		// TODO Auto-generated method stub
		return usermessagedao.getMyMessages(emailId);
	}

	@Override
	public List<UserMessage> getAllMessageByCircleName(String circleName) {
		// TODO Auto-generated method stub
		return usermessagedao.getAllMessageByCircleName(circleName);
	}

	@Override
	public boolean isRecieverExists(String recieverEmailId) {
		// TODO Auto-generated method stub
		return usermessagedao.isRecieverExists(recieverEmailId);
	}

	@Override
	public boolean isCircleExists(String circleName) {
		// TODO Auto-generated method stub
		return usermessagedao.isCircleExists(circleName);
	}

	@Override
	public List<UserMessage> getAllMessageByUser(String senderEmailId, String receiverEmailId) {
		// TODO Auto-generated method stub
		return usermessagedao.getAllMessageByUser(senderEmailId, receiverEmailId);
	}

}
