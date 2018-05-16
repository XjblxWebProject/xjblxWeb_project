package com.xjblx.po;

public class QuestionnaireCreate {
    private String username;

    public String questionnairName;

    private String questionnairQuestion;

    private String questionnairChoice;

    private Integer questionnairType;

    private Integer choicenum;

    private String eachchoicenum;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username == null ? null : username.trim();
    }

    public String getQuestionnairName() {
        return questionnairName;
    }

    public void setQuestionnairName(String questionnairName) {
        this.questionnairName = questionnairName == null ? null : questionnairName.trim();
    }

    public String getQuestionnairQuestion() {
        return questionnairQuestion;
    }

    public void setQuestionnairQuestion(String questionnairQuestion) {
        this.questionnairQuestion = questionnairQuestion == null ? null : questionnairQuestion.trim();
    }

    public String getQuestionnairChoice() {
        return questionnairChoice;
    }

    public void setQuestionnairChoice(String questionnairChoice) {
        this.questionnairChoice = questionnairChoice == null ? null : questionnairChoice.trim();
    }

    public Integer getQuestionnairType() {
        return questionnairType;
    }

    public void setQuestionnairType(Integer questionnairType) {
        this.questionnairType = questionnairType;
    }

    public Integer getChoicenum() {
        return choicenum;
    }

    public void setChoicenum(Integer choicenum) {
        this.choicenum = choicenum;
    }

    public String getEachchoicenum() {
        return eachchoicenum;
    }

    public void setEachchoicenum(String eachchoicenum) {
        this.eachchoicenum = eachchoicenum == null ? null : eachchoicenum.trim();
    }
}