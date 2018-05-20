package com.herokuuapp.angular.chatapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.herokuuapp.angular.chatapp.dao.Dao;
import com.herokuuapp.angular.chatapp.domain.Room;

@Controller
public class IndexController {
	@Autowired
	private Dao dao;
	
	@RequestMapping(value="/")
	public String index(){
		return "index";
	}
	@RequestMapping(value="/login")
	public String login(){
		return "login";
	}
	
	@RequestMapping(value="/logout")
	public String logout(){
		return "redirect:";
	}
	
	@RequestMapping(value="/signup")
	public String signup(){
		return "signup";
	}
	@RequestMapping(value="room/{id}")
	public String moveRoomChat(@PathVariable("id") Long id, Model model){
		Room room = dao.findRoomById(id);
		model.addAttribute("room", room);
		return "room";
	}
}
