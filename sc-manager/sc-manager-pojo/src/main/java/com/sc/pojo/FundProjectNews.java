package com.sc.pojo;

import java.util.Date;

public class FundProjectNews {
    private Integer newId;

    private Integer fundProjectId;

    private String title;

    private Date date;

    private String writter;

    private byte[] content;

    public Integer getNewId() {
        return newId;
    }

    public void setNewId(Integer newId) {
        this.newId = newId;
    }

    public Integer getFundProjectId() {
        return fundProjectId;
    }

    public void setFundProjectId(Integer fundProjectId) {
        this.fundProjectId = fundProjectId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getWritter() {
        return writter;
    }

    public void setWritter(String writter) {
        this.writter = writter == null ? null : writter.trim();
    }

    public byte[] getContent() {
        return content;
    }

    public void setContent(byte[] content) {
        this.content = content;
    }
}