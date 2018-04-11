package com.xx.qa.model;

/**
 * Created by catherine.liu on 15-4-14.
 */
public class NaviModel {
    int id;
    String navigationName;
    String navigationUrl;
    int pid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNavigationUrl() {
        return navigationUrl;
    }

    public void setNavigationUrl(String navigationUrl) {
        this.navigationUrl = navigationUrl;
    }

    public String getNavigationName() {
        return navigationName;
    }

    public void setNavigationName(String navigationName) {
        this.navigationName = navigationName;
    }

}
