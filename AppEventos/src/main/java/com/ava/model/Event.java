package com.ava.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.sql.Date;

@Entity
public class Event {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    private String name;
    private Date date;
    private String location;
    private Integer capacity;

    public Event() {
    }

    public Event(String id, String name, Date date, String location, Integer capacity) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.location = location;
        this.capacity = capacity;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Date getDate() {
        return date;
    }

    public String getLocation() {
        return location;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return "Event{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", date=" + date +
                ", location='" + location + '\'' +
                ", capacity=" + capacity +
                '}';
    }
}
