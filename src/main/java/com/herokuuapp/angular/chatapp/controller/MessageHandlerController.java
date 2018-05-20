package com.herokuuapp.angular.chatapp.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;

import com.herokuuapp.angular.chatapp.domain.OutputMessage;

@MessageMapping("/room")
@SendTo("/topic/messages")
public class MessageHandlerController {
    public OutputMessage sendMessage(OutputMessage mes){
    	String time = new SimpleDateFormat("HH:mm").format(new Date());
        return new OutputMessage(time, mes.getFrom(), mes.getText());
    }
	
}
