package com.ava.controller;

import com.ava.service.EventService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/events")
public class EventController {
    @Autowired
    EventService eventService;

    public Event
}
