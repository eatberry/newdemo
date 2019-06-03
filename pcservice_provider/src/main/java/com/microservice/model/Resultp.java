package com.microservice.model;

import java.util.ArrayList;
import java.util.List;

public class Resultp {

    private String msg;

    private String url;
    private List<PCService> plist = new ArrayList<PCService>();

    public Resultp(List<PCService> plist) {
        this.plist = plist;
    }

    public List<PCService> getPlist() {
        return plist;
    }

    public void setPlist(List<PCService> plist) {
        this.plist = plist;
    }

    @Override
    public String toString() {
        return "Resultp{" +
                "msg='" + msg + '\'' +
                ", url='" + url + '\'' +
                ", plist=" + plist +
                '}';
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }



    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }





    public Resultp(String msg) {
        this.msg = msg;
    }

    public Resultp() {
    }

}
