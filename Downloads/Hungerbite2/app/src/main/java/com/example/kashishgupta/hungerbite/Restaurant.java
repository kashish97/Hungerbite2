package com.example.kashishgupta.hungerbite;

public class Restaurant {
    String restname;
    String restcityname;

    public String getRestname() {
        return restname;
    }

    public void setRestname(String restname) {
        this.restname = restname;
    }

    public String getRestcityname() {
        return restcityname;
    }

    public void setRestcityname(String restcityname) {
        this.restcityname = restcityname;
    }

    public String getRestlocname() {
        return restlocname;
    }

    public void setRestlocname(String restlocname) {
        this.restlocname = restlocname;
    }

    public String getMinorder() {
        return minorder;
    }

    public void setMinorder(String minorder) {
        this.minorder = minorder;
    }

    public String getImgurl() {
        return imgurl;
    }

    public void setImgurl(String imgurl) {
        this.imgurl = imgurl;
    }

    String restlocname;
    String minorder;
    String imgurl;
    String Resid;
    String Locid;

    public Restaurant(String restname, String restcityname, String restlocname, String minorder, String imgurl, String resid, String locid) {
        this.restname = restname;
        this.restcityname = restcityname;
        this.restlocname = restlocname;
        this.minorder = minorder;
        this.imgurl = imgurl;
        Resid = resid;
        Locid = locid;
    }

    public String getResid() {
        return Resid;
    }

    public void setResid(String resid) {
        Resid = resid;
    }

    public String getLocid() {
        return Locid;
    }

    public void setLocid(String locid) {
        Locid = locid;
    }

    public Restaurant() {
    }
}