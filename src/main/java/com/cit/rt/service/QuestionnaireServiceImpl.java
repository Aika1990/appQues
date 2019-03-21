package com.cit.rt.service;

import com.cit.rt.entity.Questionnaire;
import com.cit.rt.repository.QuestionnaireRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class QuestionnaireServiceImpl implements QuestionnaireService{

    @Autowired
    QuestionnaireRepository questionnaireRepository;

    public List<Questionnaire> getAll() {
        return questionnaireRepository.findAll();
    }

    public Questionnaire getByID(int id) {
        return questionnaireRepository.findOne(id);
    }

    public Questionnaire save(Questionnaire remind) {
        return questionnaireRepository.saveAndFlush(remind);
    }

    public void remove(int id) {
        questionnaireRepository.delete(id);
    }
}
