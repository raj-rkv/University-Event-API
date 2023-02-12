package com.example.Universityeventmanagement.repository;

import com.example.Universityeventmanagement.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EventRepository extends JpaRepository<Event,Integer> {

}
