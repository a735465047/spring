package com.wowo.model;

/**
 * Created by chenl.chen on 2016/3/30.
 */
public enum ParamType {
    IP(1), UID(2);

    private int id;
    private ParamType(final int id){
        this.id = id;
    }

    public int getId() {
        return id;
    }
}
