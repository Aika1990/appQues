package com.cit.rt.service;

import com.cit.rt.entity.Settlement;
import com.cit.rt.repository.SettlementRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class SettlementServiceImpl implements SettlementService{

    @Autowired
    SettlementRepository settlementRepository;

    public List<Settlement> getAll() {
        return settlementRepository.findAll();
    }

    public Settlement getByID(int id) {
        return settlementRepository.findOne(id);
    }

    public Settlement save(Settlement remind) {
        return settlementRepository.saveAndFlush(remind);
    }

    public void remove(int id) {
        settlementRepository.delete(id);
    }
}
