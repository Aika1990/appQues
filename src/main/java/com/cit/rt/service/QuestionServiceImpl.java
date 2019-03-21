package com.cit.rt.service;

import com.cit.rt.entity.Question;
import com.cit.rt.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class QuestionServiceImpl implements QuestionService{

    @Autowired
    QuestionRepository questionRepository;

    public List<Question> getAll() {
        return questionRepository.findAll();
    }

    public Question getByID(int id) {
        return questionRepository.findOne(id);
    }

    public Question save(Question remind) {
        return questionRepository.saveAndFlush(remind);
    }

    public void remove(int id) {
        questionRepository.delete(id);
    }
}
