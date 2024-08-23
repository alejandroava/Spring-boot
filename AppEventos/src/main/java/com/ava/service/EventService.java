package com.ava.service;

import com.ava.model.Event;
import com.ava.repository.EventRepository;
import com.ava.repository.imodel.IModelEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class EventService implements IModelEvent {

    @Autowired
    EventRepository eventRepository;


    @Override
    public Event createEvent(Event event) {
        return null;
    }

    @Override
    public void deleteById(String id) {

    }
}
