package com.cit.rt.service;

import com.cit.rt.entity.AppSettings;
import com.cit.rt.repository.AppSettingsRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AppSettingsServiceImpl implements AppSettingsService{

    @Autowired
    AppSettingsRepository appSettingsRepository;

    public List<AppSettings> getAll() {
        return appSettingsRepository.findAll();
    }

    public AppSettings getByID(int id) {
        return appSettingsRepository.findOne(id);
    }

    public AppSettings save(AppSettings remind) {
        return appSettingsRepository.saveAndFlush(remind);
    }

    public void remove(int id) {
        appSettingsRepository.delete(id);
    }
}
