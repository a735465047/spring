package com.wowo.model;

import java.util.Date;

/**
 * Created by chenl.chen on 2016/3/30.
 */
public class ParamBean {
    private int id;
    private int paramType;
    private String paramKey;
    private float paramScore;
    private Date createdTime;

    public int getId() {
        return id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public int getParamType() {
        return paramType;
    }

    public void setParamType(final int paramType) {
        this.paramType = paramType;
    }

    public String getParamKey() {
        return paramKey;
    }

    public void setParamKey(final String paramKey) {
        this.paramKey = paramKey;
    }

    public float getParamScore() {
        return paramScore;
    }

    public void setParamScore(final float paramScore) {
        this.paramScore = paramScore;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(final Date createdTime) {
        this.createdTime = createdTime;
    }
}
