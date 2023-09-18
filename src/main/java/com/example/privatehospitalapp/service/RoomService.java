package com.example.privatehospitalapp.service;

import com.example.privatehospitalapp.dao.RoomRepository;
import com.example.privatehospitalapp.entity.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RoomService {

    @Autowired
    public RoomRepository roomRepository;

    public Room saveRoom(Room room){
        return roomRepository.save(room);
    }

    public Room searchRoomById(Long id){
        Room room = roomRepository.findById(id).get();
        return room;
    }

    public List<Room> getAllRooms(){
        return roomRepository.findAll();
    }

    public void deleteRoomById(Long id){
        roomRepository.deleteById(id);
    }
}
