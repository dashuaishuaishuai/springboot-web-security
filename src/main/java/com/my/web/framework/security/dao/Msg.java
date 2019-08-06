package com.my.web.framework.security.dao;

/**
 * @author 华安  mashuai_bj@si-tech.com.cn
 * @Title:
 * @Date: Create in 16:05 2018/9/4
 * @Description:
 */
public class Msg {
    private String title;
    private String context;
    private String remark;

    public Msg(String title, String context, String remark) {
        this.title = title;
        this.context = context;
        this.remark = remark;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
}