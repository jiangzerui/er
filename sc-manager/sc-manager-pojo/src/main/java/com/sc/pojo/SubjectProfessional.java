package com.sc.pojo;

public class SubjectProfessional {
    private Integer subjectProfessionalId;

    private Integer subjectId;

    private Integer userProfessionalId;

    private Double score;

    private String suggest;

    private Integer reviewed;

    public Integer getSubjectProfessionalId() {
        return subjectProfessionalId;
    }

    public void setSubjectProfessionalId(Integer subjectProfessionalId) {
        this.subjectProfessionalId = subjectProfessionalId;
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public Integer getUserProfessionalId() {
        return userProfessionalId;
    }

    public void setUserProfessionalId(Integer userProfessionalId) {
        this.userProfessionalId = userProfessionalId;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getSuggest() {
        return suggest;
    }

    public void setSuggest(String suggest) {
        this.suggest = suggest == null ? null : suggest.trim();
    }

    public Integer getReviewed() {
        return reviewed;
    }

    public void setReviewed(Integer reviewed) {
        this.reviewed = reviewed;
    }
}