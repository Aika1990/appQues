package com.cit.rt.service;

import com.cit.rt.entity.District;

import java.util.List;

public interface DistrictService {

    List<District> getAll();
    District getByID(int id);
    District save(District remind);
    void remove(int id);
}
