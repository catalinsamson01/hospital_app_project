package com.example.privatehospitalapp.dao;

import com.example.privatehospitalapp.entity.Patient;
import com.example.privatehospitalapp.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {

    Room save(Room room);
    Optional<Room> findById(Long id);

    List<Room> findAll();
    void deleteById(Long id);
}
