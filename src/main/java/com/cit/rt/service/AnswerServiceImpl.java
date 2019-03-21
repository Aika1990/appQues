package com.cit.rt.service;

import com.cit.rt.entity.Answer;
import com.cit.rt.repository.AnswerRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AnswerServiceImpl implements AnswerService{

    @Autowired
    AnswerRepository answerRepository;

    public List<Answer> getAll() {
        return answerRepository.findAll();
    }

    public Answer getByID(int id) {
        return answerRepository.findOne(id);
    }

    public Answer save(Answer remind) {
        return answerRepository.saveAndFlush(remind);
    }

    public void remove(int id) {
        answerRepository.delete(id);
    }
}
