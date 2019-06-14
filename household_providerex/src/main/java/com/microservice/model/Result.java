package com.microservice.model;

import java.util.ArrayList;
import java.util.List;

public class Result {

    private String msg;
    private HouseHold houseHold;
    private String url;
    private List<HouseHold> list = new ArrayList<HouseHold>();
    private List<PCService> plist = new ArrayList<PCService>();


    public List<PCService> getPlist() {
        return plist;
    }

    public void setPlist(List<PCService> plist) {
        this.plist = plist;
    }

    @Override
    public String toString() {
        return "Result{" +
                "msg='" + msg + '\'' +
                ", houseHold=" + houseHold +
                ", url='" + url + '\'' +
                ", list=" + list +
                ", plist=" + plist +
                '}';
    }

    public List<HouseHold> getList() {
        return list;
    }

    public void setList(List<HouseHold> list) {
        this.list = list;
    }

    public Result(List<HouseHold> list) {
        this.list = list;
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



    public Result(String msg) {
        this.msg = msg;
    }

    public Result() {
    }

    public Result(String msg, HouseHold houseHold) {
        this.msg = msg;
        this.houseHold = houseHold;

    }
}
