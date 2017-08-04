package com.sc.pojo;

public class ProfessionClassDic {
    private Integer pClassId;

    private String code;

    private String professional;

    private String className;

    public Integer getpClassId() {
        return pClassId;
    }

    public void setpClassId(Integer pClassId) {
        this.pClassId = pClassId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code == null ? null : code.trim();
    }

    public String getProfessional() {
        return professional;
    }

    public void setProfessional(String professional) {
        this.professional = professional == null ? null : professional.trim();
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }
}