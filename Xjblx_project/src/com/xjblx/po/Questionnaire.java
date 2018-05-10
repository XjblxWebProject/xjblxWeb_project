package com.xjblx.po;

public class Questionnaire {
    private Integer id;

    private String username;

    private String questionnairName;

    private String createdate;

    private String naireUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getCreatedate() {
        return createdate;
    }

    public void setCreatedate(String createdate) {
        this.createdate = createdate == null ? null : createdate.trim();
    }

    public String getNaireUrl() {
        return naireUrl;
    }

    public void setNaireUrl(String naireUrl) {
        this.naireUrl = naireUrl == null ? null : naireUrl.trim();
    }
}