package com.cit.rt.service;

import com.cit.rt.entity.Remind;
import com.cit.rt.repository.RemindRepository;

import java.util.List;

public interface ReminderService {

    List<Remind> getAll();
    Remind getByID(int id);
    Remind save(Remind remind);
    void remove(int id);
}
