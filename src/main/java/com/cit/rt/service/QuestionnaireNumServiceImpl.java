package com.cit.rt.service;

import com.cit.rt.entity.QuestionnaireNum;
import com.cit.rt.repository.QuestionnaireNumRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class QuestionnaireNumServiceImpl implements QuestionnaireNumService{

    @Autowired
    QuestionnaireNumRepository questionnaireNumRepository;

    public List<QuestionnaireNum> getAll() {
        return questionnaireNumRepository.findAll();
    }

    public QuestionnaireNum getByID(int id) {
        return questionnaireNumRepository.findOne(id);
    }

    public QuestionnaireNum save(QuestionnaireNum remind) {
        return questionnaireNumRepository.saveAndFlush(remind);
    }

    public void remove(int id) {
        questionnaireNumRepository.delete(id);
    }
}
