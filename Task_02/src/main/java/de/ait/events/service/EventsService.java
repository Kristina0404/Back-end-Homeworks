package de.ait.events.service;



import de.ait.events.models.Event;

import java.time.LocalDate;
import java.util.List;
public interface EventsService {
    Event addEvent(String title, LocalDate startDate, LocalDate endDate);

    List<Event> getAllEvents();
}