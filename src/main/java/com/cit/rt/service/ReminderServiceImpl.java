package com.cit.rt.service;

import com.cit.rt.entity.Remind;
import com.cit.rt.repository.RemindRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class ReminderServiceImpl implements  ReminderService{

    @Autowired
    private RemindRepository repository;

    public List<Remind> getAll() {
        return repository.findAll();
    }

    public Remind getByID(int id) {
        return repository.findOne(id);
    }

    public Remind save(Remind remind) {
        return repository.saveAndFlush(remind);
    }

    public void remove(int id) {
        repository.delete(id);
    }

}
