package com.sc.pojo;

public class SubjectStatus {
    private Integer subjectStatusId;

    private String subjectStatusName;

    private String subjectStatusCode;

    public Integer getSubjectStatusId() {
        return subjectStatusId;
    }

    public void setSubjectStatusId(Integer subjectStatusId) {
        this.subjectStatusId = subjectStatusId;
    }

    public String getSubjectStatusName() {
        return subjectStatusName;
    }

    public void setSubjectStatusName(String subjectStatusName) {
        this.subjectStatusName = subjectStatusName == null ? null : subjectStatusName.trim();
    }

    public String getSubjectStatusCode() {
        return subjectStatusCode;
    }

    public void setSubjectStatusCode(String subjectStatusCode) {
        this.subjectStatusCode = subjectStatusCode == null ? null : subjectStatusCode.trim();
    }
}