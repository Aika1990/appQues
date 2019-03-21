package com.cit.rt.service;

import com.cit.rt.entity.Questionnaire;

import java.util.List;

public interface QuestionnaireService {

    List<Questionnaire> getAll();
    Questionnaire getByID(int id);
    Questionnaire save(Questionnaire remind);
    void remove(int id);
}
