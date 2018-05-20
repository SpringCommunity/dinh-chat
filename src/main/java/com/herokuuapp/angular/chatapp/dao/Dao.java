package com.herokuuapp.angular.chatapp.dao;

import java.util.List;

import org.springframework.stereotype.Service;

import com.herokuuapp.angular.chatapp.domain.Room;
import com.herokuuapp.angular.chatapp.domain.User;

@Service
public interface Dao {
    public List<Room> findAllRoom();
    public Room findRoomById(long roomId);
    public int createNewUser(User user);
    public List<User> findAllUser();
}
