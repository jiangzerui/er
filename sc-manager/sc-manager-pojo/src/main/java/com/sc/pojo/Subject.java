package com.sc.pojo;

public class Subject {
    private Integer subjectId;

    private String subjectCode;

    private String subjectName;

    private String description;

    private Integer userId;

    private Integer projectId;

    private Integer subjectStatusId;

    private Integer subjectResultId;

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }

    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode == null ? null : subjectCode.trim();
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName == null ? null : subjectName.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public Integer getSubjectStatusId() {
        return subjectStatusId;
    }

    public void setSubjectStatusId(Integer subjectStatusId) {
        this.subjectStatusId = subjectStatusId;
    }

    public Integer getSubjectResultId() {
        return subjectResultId;
    }

    public void setSubjectResultId(Integer subjectResultId) {
        this.subjectResultId = subjectResultId;
    }
}