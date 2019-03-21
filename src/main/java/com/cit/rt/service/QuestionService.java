package com.cit.rt.service;

import com.cit.rt.entity.Question;

import java.util.List;

public interface QuestionService {

    List<Question> getAll();
    Question getByID(int id);
    Question save(Question remind);
    void remove(int id);
}
