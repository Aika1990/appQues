package com.cit.rt.service;

import com.cit.rt.entity.Answer;

import java.util.List;

public interface AnswerService {

    List<Answer> getAll();
    Answer getByID(int id);
    Answer save(Answer remind);
    void remove(int id);
}
