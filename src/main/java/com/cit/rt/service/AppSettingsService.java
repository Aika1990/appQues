package com.cit.rt.service;

import com.cit.rt.entity.AppSettings;

import java.util.List;

public interface AppSettingsService {

    List<AppSettings> getAll();
    AppSettings getByID(int id);
    AppSettings save(AppSettings remind);
    void remove(int id);
}
