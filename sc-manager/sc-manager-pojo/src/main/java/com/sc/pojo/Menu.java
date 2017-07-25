package com.sc.pojo;

public class Menu {
    private Integer menuId;

    private Integer menuName;

    private String menuCode;

    public Integer getMenuId() {
        return menuId;
    }

    public void setMenuId(Integer menuId) {
        this.menuId = menuId;
    }

    public Integer getMenuName() {
        return menuName;
    }

    public void setMenuName(Integer menuName) {
        this.menuName = menuName;
    }

    public String getMenuCode() {
        return menuCode;
    }

    public void setMenuCode(String menuCode) {
        this.menuCode = menuCode == null ? null : menuCode.trim();
    }
}