package com.cit.rt.entity;

import javax.persistence.*;

@Entity
@Table(name = "questionnaire")
public class Questionnaire {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = true, name = "questionnaire_num_id")
    private QuestionnaireNum questionnaireNum;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = true, name = "answer_id")
    private Answer answer;
    @Column(name = "description_other")
    private String descriptionOther;
    @Column(name = "id_parent_answer")
    private int idParentAnswer;

    public Questionnaire() {
    }

    public Questionnaire(QuestionnaireNum questionnaireNum, Answer answer, String descriptionOther, int idParentAnswer) {
        this.questionnaireNum = questionnaireNum;
        this.answer = answer;
        this.descriptionOther = descriptionOther;
        this.idParentAnswer = idParentAnswer;
    }

    public int getId() {
        return id;
    }

    public QuestionnaireNum getQuestionnaireNum() {
        return questionnaireNum;
    }

    public void setQuestionnaireNum(QuestionnaireNum questionnaireNum) {
        this.questionnaireNum = questionnaireNum;
    }

    public Answer getAnswer() {
        return answer;
    }

    public void setAnswer(Answer answer) {
        this.answer = answer;
    }

    public String getDescriptionOther() {
        return descriptionOther;
    }

    public void setDescriptionOther(String descriptionOther) {
        this.descriptionOther = descriptionOther;
    }

    public int getIdParentAnswer() {
        return idParentAnswer;
    }

    public void setIdParentAnswer(int idParentAnswer) {
        this.idParentAnswer = idParentAnswer;
    }

    @Override
    public String toString() {
        return "Questionnaire{" +
                "id=" + id +
                ", questionnaireNum=" + questionnaireNum +
                ", answer=" + answer +
                ", descriptionOther='" + descriptionOther + '\'' +
                ", idParentAnswer=" + idParentAnswer +
                '}';
    }
}

