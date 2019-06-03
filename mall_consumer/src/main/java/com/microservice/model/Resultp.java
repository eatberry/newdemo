package com.microservice.model;

import java.util.ArrayList;
import java.util.List;

public class Resultp {

    private String msg;
    private HouseHold houseHold;
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
                ", houseHold=" + houseHold +
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

    public HouseHold getHouseHold() {
        return houseHold;
    }

    public void setHouseHold(HouseHold houseHold) {
        this.houseHold = houseHold;
    }



    public Resultp(String msg) {
        this.msg = msg;
    }

    public Resultp() {
    }

    public Resultp(String msg, HouseHold houseHold) {
        this.msg = msg;
        this.houseHold = houseHold;

    }
}
