package com.sc.pojo;

public class ProjectOrgnaization {
    private Integer projectOrgnaizationId;

    private String projectCode;

    private Integer organizationId;

    public Integer getProjectOrgnaizationId() {
        return projectOrgnaizationId;
    }

    public void setProjectOrgnaizationId(Integer projectOrgnaizationId) {
        this.projectOrgnaizationId = projectOrgnaizationId;
    }

    public String getProjectCode() {
        return projectCode;
    }

    public void setProjectCode(String projectCode) {
        this.projectCode = projectCode == null ? null : projectCode.trim();
    }

    public Integer getOrganizationId() {
        return organizationId;
    }

    public void setOrganizationId(Integer organizationId) {
        this.organizationId = organizationId;
    }
}