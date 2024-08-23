package com.ava.service;

import com.ava.model.Event;
import com.ava.repository.EventRepository;
import com.ava.repository.imodel.IModelEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EventService implements IModelEvent{

    @Autowired
    EventRepository eventRepository;

    @Override
    public Event createEvent(Event event) {
        eventRepository.save(event);
        return event;
    }

    @Override
    public void deleteById(String id) {
        eventRepository.deleteById(id);
    }

    @Override
    public List<Event> readAll() {
       return null;
    }
    public Iterable<Event> readAllEvent(){
        return eventRepository.findAll();
    }

    @Override
    public Event readById(String id) {
        return null;
    }

    @Override
    public Event updateEvent(Event event, String id) {
        Optional<Event> optionalEvent = eventRepository.findById(id);
        if(optionalEvent.isPresent()){
            Event updateEvent = optionalEvent.get();
            if(event.getName() != null){
                updateEvent.setName(event.getName());
            }
            if(event.getDate() != null){
                updateEvent.setDate(event.getDate());
            }
            if(event.getLocation() != null){
                updateEvent.setLocation(event.getLocation());
            }
            if(event.getCapacity() != null){
                updateEvent.setCapacity(event.getCapacity());
            }
            return updateEvent;
        }
        return null;
    }
}
