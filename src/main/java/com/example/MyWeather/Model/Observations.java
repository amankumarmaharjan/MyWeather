package com.example.MyWeather.Model;

import java.util.List;

public class Observations {
    private List< Notice> notice;
    private List< Header> header;
    private List<Weather> data;

    public List<Notice> getNotice() {
        return notice;
    }

    public void setNotice(List<Notice> notice) {
        this.notice = notice;
    }

    public List<Header> getHeader() {
        return header;
    }

    public void setHeader(List<Header> header) {
        this.header = header;
    }

    public List<Weather> getData() {
        return data;
    }

    public void setData(List<Weather> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Observations{" +
                "notice=" + notice +
                ", header=" + header +
                ", data=" + data +
                '}';
    }
}
