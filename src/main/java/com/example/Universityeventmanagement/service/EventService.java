package com.example.Universityeventmanagement.service;

import com.example.Universityeventmanagement.model.Event;
import com.example.Universityeventmanagement.repository.EventRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EventService implements IEventService {

    @Autowired
    private EventRepository eventRepository;

    @Override
    public void addEvent(Event event){
        eventRepository.save(event);
    }
    @Override
    public void updateEvent(int id,Event event)
    {
        Event newevent=eventRepository.findById(id).get();
        newevent.setEventId(event.getEventId());
        newevent.setEventLocation(event.getEventLocation());
        newevent.setEventName(event.getEventName());
        newevent.setDate(event.getDate());
        newevent.setStartTime(event.getStartTime());
        newevent.setEndTime(event.getEndTime());
        eventRepository.save(newevent);

    }

    @Override
    public void deleteEvent(int id){
        eventRepository.deleteById(id);
    }

    @Override
    public Event getById(Integer id)
    {
        return eventRepository.findById(id).get();
    }
}
