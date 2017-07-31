package com.sc.pojo;

public class Subject {
    private Integer subjectId;

    private String subjectCode;

    private String subjectName;

    private String description;

    private Integer userId;

    private Integer projectId;

    private Integer subjectStatus;

    private Integer pmId;

    private String pmSuggest;

    private Integer professionalId;

    private String professionalSuggest;

    private Integer orgId;

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

    public Integer getSubjectStatus() {
        return subjectStatus;
    }

    public void setSubjectStatus(Integer subjectStatus) {
        this.subjectStatus = subjectStatus;
    }

    public Integer getPmId() {
        return pmId;
    }

    public void setPmId(Integer pmId) {
        this.pmId = pmId;
    }

    public String getPmSuggest() {
        return pmSuggest;
    }

    public void setPmSuggest(String pmSuggest) {
        this.pmSuggest = pmSuggest == null ? null : pmSuggest.trim();
    }

    public Integer getProfessionalId() {
        return professionalId;
    }

    public void setProfessionalId(Integer professionalId) {
        this.professionalId = professionalId;
    }

    public String getProfessionalSuggest() {
        return professionalSuggest;
    }

    public void setProfessionalSuggest(String professionalSuggest) {
        this.professionalSuggest = professionalSuggest == null ? null : professionalSuggest.trim();
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }
}