package com.niit.UserBoot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.niit.UserBoot.model.User;
import com.niit.UserBoot.service.UserService;

@RestController  
@CrossOrigin(origins="http://localhost:4200")  
@RequestMapping(value="/api")
public class UserController {
	@Autowired  
    private UserService userservice;
	
	 @PostMapping("/user")  
	    public boolean save(@RequestBody User user) {  
	         return userservice.save(user);  
	          
	    }
	 @PutMapping("/user")  
	    public boolean update(@RequestBody User user) {  
	         return userservice.update(user);  
	          
	    }
//	  @GetMapping("User/{userId}")  
//	    public User get(@PathVariable("id") String userId,User user) {   //int id is declared in User Model
//		  user.setUserId(userId);  
//	         return userservice.get(userId);  
//	          
//	    }  
	 
	 @ResponseBody
	 @RequestMapping(value = "/User", method = RequestMethod.GET)
	    public ResponseEntity<List<User>> list() {
		 List<User> users = userservice.list();
	        if(users.isEmpty()){
	            return new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT);
	        }
	        return new ResponseEntity<List<User>>(users, HttpStatus.OK);
	    } 

	 
//	 public User validate(String id, String password) {
//			// TODO Auto-generated method stub
//			return userservice.validate(id, password);
//		}
}
