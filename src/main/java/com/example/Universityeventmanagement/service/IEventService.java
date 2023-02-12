package com.example.Universityeventmanagement.service;

import com.example.Universityeventmanagement.model.Event;

public interface IEventService {
    public void addEvent(Event event);
    public void updateEvent(int id,Event event);
    public void deleteEvent(int id);

    public Event getById(Integer id);
}
