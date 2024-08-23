package com.ava.controller;

import com.ava.model.Event;
import com.ava.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.Date;

@RestController
@RequestMapping("/events")
public class EventController {
    @Autowired
    EventService eventService;

    @PostMapping()
    public Event createEvent(@RequestBody Event event){
        if(validateCapaciy(event)){
            if(validateDate(event)){
                eventService.createEvent(event);
                return event;
            }
        }
     return null;
    }

    @DeleteMapping("/{id}")
    public void deleteEvent(@PathVariable String id){
        eventService.deleteById(id);
    }

    @GetMapping()
    public Iterable<Event> getAllEvent(){
       return eventService.readAllEvent();
    }
    //Validacion capacidad
    public boolean validateCapaciy(Event event){
        if(event.getCapacity() < 0){
            return false;
        }
        return true;
    }
    //validacion fecha
    public boolean validateDate(Event event){
        Date today = new Date();
        if(event.getDate().before(today)){
            return false;
        }
        return true;
    }

    @PatchMapping("/{id}")
    public Event updateEvent(@RequestBody Event event,@PathVariable String id){
      return eventService.updateEvent(event,id);
    }
}
