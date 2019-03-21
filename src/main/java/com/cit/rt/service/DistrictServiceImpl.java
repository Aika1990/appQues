package com.cit.rt.service;

import com.cit.rt.entity.District;
import com.cit.rt.repository.DistrictRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DistrictServiceImpl implements DistrictService{

    @Autowired
    DistrictRepository districtRepository;

    public List<District> getAll() {
        return districtRepository.findAll();
    }

    public District getByID(int id) {
        return districtRepository.findOne(id);
    }

    public District save(District remind) {
        return districtRepository.saveAndFlush(remind);
    }

    public void remove(int id) {
        districtRepository.delete(id);
    }
}
