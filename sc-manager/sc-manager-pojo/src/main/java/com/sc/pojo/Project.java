package com.sc.pojo;

public class Project {
    private Integer projectId;

    private String projectName;

    private String projectCode;

    private String description;

    private Integer projectType;

    private String guideCode;

    private String projectLogoUrl;

    private Integer userId;

    public Integer getProjectId() {
        return projectId;
    }

    public void setProjectId(Integer projectId) {
        this.projectId = projectId;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName == null ? null : projectName.trim();
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode == null ? null : projectCode.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Integer getProjectType() {
        return projectType;
    }

    public void setProjectType(Integer projectType) {
        this.projectType = projectType;
    }

    public String getGuideCode() {
        return guideCode;
    }

    public void setGuideCode(String guideCode) {
        this.guideCode = guideCode == null ? null : guideCode.trim();
    }

    public String getProjectLogoUrl() {
        return projectLogoUrl;
    }

    public void setProjectLogoUrl(String projectLogoUrl) {
        this.projectLogoUrl = projectLogoUrl == null ? null : projectLogoUrl.trim();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
}