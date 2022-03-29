package com.example.MyWeather.Model;

public class Header {
    private String refresh_message;
    private String ID;
    private String main_ID;
    private String name;
    private String state_time_zone;
    private String time_zone;
    private String product_name;
    private String state;

    public String getRefresh_message() {
        return refresh_message;
    }

    public void setRefresh_message(String refresh_message) {
        this.refresh_message = refresh_message;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getMain_ID() {
        return main_ID;
    }

    public void setMain_ID(String main_ID) {
        this.main_ID = main_ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState_time_zone() {
        return state_time_zone;
    }

    public void setState_time_zone(String state_time_zone) {
        this.state_time_zone = state_time_zone;
    }

    public String getTime_zone() {
        return time_zone;
    }

    public void setTime_zone(String time_zone) {
        this.time_zone = time_zone;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Header{" +
                "refresh_message='" + refresh_message + '\'' +
                ", ID='" + ID + '\'' +
                ", main_ID='" + main_ID + '\'' +
                ", name='" + name + '\'' +
                ", state_time_zone='" + state_time_zone + '\'' +
                ", time_zone='" + time_zone + '\'' +
                ", product_name='" + product_name + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}
