package com.sc.pojo;

public class SubjectResult {
    private Integer subjectResultId;

    private String subjectResultName;

    private String subjectResultUrl;

    private String subjectResultNote;

    private String subjectResultCode;

    private Integer subjectId;

    public Integer getSubjectResultId() {
        return subjectResultId;
    }

    public void setSubjectResultId(Integer subjectResultId) {
        this.subjectResultId = subjectResultId;
    }

    public String getSubjectResultName() {
        return subjectResultName;
    }

    public void setSubjectResultName(String subjectResultName) {
        this.subjectResultName = subjectResultName == null ? null : subjectResultName.trim();
    }

    public String getSubjectResultUrl() {
        return subjectResultUrl;
    }

    public void setSubjectResultUrl(String subjectResultUrl) {
        this.subjectResultUrl = subjectResultUrl == null ? null : subjectResultUrl.trim();
    }

    public String getSubjectResultNote() {
        return subjectResultNote;
    }

    public void setSubjectResultNote(String subjectResultNote) {
        this.subjectResultNote = subjectResultNote == null ? null : subjectResultNote.trim();
    }

    public String getSubjectResultCode() {
        return subjectResultCode;
    }

    public void setSubjectResultCode(String subjectResultCode) {
        this.subjectResultCode = subjectResultCode == null ? null : subjectResultCode.trim();
    }

    public Integer getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Integer subjectId) {
        this.subjectId = subjectId;
    }
}