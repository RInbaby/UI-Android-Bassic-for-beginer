package com.example.inforcie.Model;

public class Notifications {
    String notice;
    String time;

    public String getNotice() {
        return notice;
    }

    public void setNotice(String notice) {
        this.notice = notice;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public Notifications(String notice, String time) {
        this.notice = notice;
        this.time = time;
    }
}
