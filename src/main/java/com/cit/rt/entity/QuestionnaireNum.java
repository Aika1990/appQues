package com.cit.rt.entity;

import javax.persistence.*;

@Entity
@Table(name = "questionnaire_numb")
public class QuestionnaireNum {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = true, name = "app_settings_id")
    private AppSettings appSettings;

    public QuestionnaireNum() {
    }

    public QuestionnaireNum(AppSettings appSettings) {
        this.appSettings = appSettings;
    }

    public int getId() {
        return id;
    }

    public AppSettings getAppSettings() {
        return appSettings;
    }

    public void setAppSettings(AppSettings appSettings) {
        this.appSettings = appSettings;
    }

    @Override
    public String toString() {
        return "QuestionnaireNum{" +
                "id=" + id +
                ", appSettings=" + appSettings +
                '}';
    }
}
