package com.xjblx.po;

public class QuestionnaireCreate {
    private Integer id;

    private String tablename;

    private String tablequestion;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTablename() {
        return tablename;
    }

    public void setTablename(String tablename) {
        this.tablename = tablename == null ? null : tablename.trim();
    }

    public String getTablequestion() {
        return tablequestion;
    }

    public void setTablequestion(String tablequestion) {
        this.tablequestion = tablequestion == null ? null : tablequestion.trim();
    }
}