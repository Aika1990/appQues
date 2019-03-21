package com.cit.rt.service;

import com.cit.rt.entity.Settlement;

import java.util.List;

public interface SettlementService {

    List<Settlement> getAll();
    Settlement getByID(int id);
    Settlement save(Settlement remind);
    void remove(int id);
}
