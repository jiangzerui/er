package com.sc.pojo;

import java.util.List;

public class Professor {
    private Integer professionalId;

    private String name;

    private String classid;

    private String userCode;

    private String className;

    public Integer getProfessionalId() {
        return professionalId;
    }

    public void setProfessionalId(Integer professionalId) {
        this.professionalId = professionalId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getClassid() {
        return classid;
    }

    public void setClassid(String classid) {
        this.classid = classid == null ? null : classid.trim();
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode == null ? null : userCode.trim();
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className == null ? null : className.trim();
    }
    
    public boolean getIn(List<SubjectProfessional> sps){
    	for(SubjectProfessional sp : sps){
    		if(sp.getUserProfessionalId() == this.professionalId){
    			return true;
    		}
    	}
    	return false;
    }
}

