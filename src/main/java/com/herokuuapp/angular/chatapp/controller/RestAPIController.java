package com.herokuuapp.angular.chatapp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.herokuuapp.angular.chatapp.dao.Dao;
import com.herokuuapp.angular.chatapp.domain.Room;
import com.herokuuapp.angular.chatapp.domain.User;

@RestController
@RequestMapping("api")
public class RestAPIController {
	  @Autowired
	  private Dao dao;
	  
	  @RequestMapping(value="/rooms", method= RequestMethod.GET)
      public ResponseEntity<List<Room>> findAllRoom(){
		  List<Room> rooms = dao.findAllRoom();
		  return (rooms.isEmpty())? new ResponseEntity<List<Room>>(HttpStatus.NO_CONTENT) : new ResponseEntity<List<Room>>(rooms, HttpStatus.OK);
      }
	  
	  @RequestMapping(value="/users", method= RequestMethod.GET)
      public ResponseEntity<List<User>> findAllUser(){
		  List<User> users = dao.findAllUser();
		  return (users.isEmpty())? new ResponseEntity<List<User>>(HttpStatus.NO_CONTENT) : new ResponseEntity<List<User>>(users, HttpStatus.OK);
      }
	  
}
