package com.cit.rt.controller;

import com.cit.rt.entity.Remind;
import com.cit.rt.repository.RemindRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class Reminder {

    @Autowired
    private RemindRepository remindRepository;

    @RequestMapping(value = "/reminders", method = RequestMethod.GET)
    @ResponseBody
    public List<Remind> getAllReminders() {
        return remindRepository.findAll();
    }

    @RequestMapping(value = "/reminders/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Remind getReminder(@PathVariable int id) {
        return remindRepository.findOne(id);
    }

}
