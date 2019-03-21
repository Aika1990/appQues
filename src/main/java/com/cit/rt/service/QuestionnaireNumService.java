package com.cit.rt.service;

import com.cit.rt.entity.QuestionnaireNum;

import java.util.List;

public interface QuestionnaireNumService {

    List<QuestionnaireNum> getAll();
    QuestionnaireNum getByID(int id);
    QuestionnaireNum save(QuestionnaireNum remind);
    void remove(int id);
}
