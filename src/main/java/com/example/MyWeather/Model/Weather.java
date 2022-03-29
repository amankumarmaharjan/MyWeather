package com.example.MyWeather.Model;

import org.springframework.context.annotation.Bean;


public class Weather {
    private int sort_order;
    private String wmo;
    private String name;
    private String history_product;
    private String local_date_time;
    private String local_date_time_full;
    private String aifstime_utc;
    private String lat;
    private String lon;
    private String apparent_t;
    private String cloud;
    private String cloud_base_m;
    private String cloud_oktas;
    private String cloud_type_id;
    private String cloud_type;
    private String delta_t;
    private String gust_kmh;
    private String gust_kt;
    private String air_temp;
    private String dewpt;
    private String press;
    private String press_qnh;
    private String press_msl;
    private String press_tend;
    private String rain_trace;
    private String rel_hum;
    private String sea_state;
    private String swell_dir_worded;
    private String swell_height;
    private String swell_period;
    private String vis_km;
    private String weather;
    private String wind_dir;
    private String wind_spd_kmh;
    private String wind_spd_kt;
    private String image;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getSort_order() {
        return sort_order;
    }

    public void setSort_order(int sort_order) {
        this.sort_order = sort_order;
    }

    public String getWmo() {
        return wmo;
    }

    public void setWmo(String wmo) {
        this.wmo = wmo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHistory_product() {
        return history_product;
    }

    public void setHistory_product(String history_product) {
        this.history_product = history_product;
    }

    public String getLocal_date_time() {
        return local_date_time;
    }

    public void setLocal_date_time(String local_date_time) {
        this.local_date_time = local_date_time;
    }

    public String getLocal_date_time_full() {
        return local_date_time_full;
    }

    public void setLocal_date_time_full(String local_date_time_full) {
        this.local_date_time_full = local_date_time_full;
    }

    public String getAifstime_utc() {
        return aifstime_utc;
    }

    public void setAifstime_utc(String aifstime_utc) {
        this.aifstime_utc = aifstime_utc;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getLon() {
        return lon;
    }

    public void setLon(String lon) {
        this.lon = lon;
    }

    public String getApparent_t() {
        return apparent_t;
    }

    public void setApparent_t(String apparent_t) {
        this.apparent_t = apparent_t;
    }

    public String getCloud() {
        return cloud;
    }

    public void setCloud(String cloud) {
        this.cloud = cloud;
    }

    public String getCloud_base_m() {
        return cloud_base_m;
    }

    public void setCloud_base_m(String cloud_base_m) {
        this.cloud_base_m = cloud_base_m;
    }

    public String getCloud_oktas() {
        return cloud_oktas;
    }

    public void setCloud_oktas(String cloud_oktas) {
        this.cloud_oktas = cloud_oktas;
    }

    public String getCloud_type_id() {
        return cloud_type_id;
    }

    public void setCloud_type_id(String cloud_type_id) {
        this.cloud_type_id = cloud_type_id;
    }

    public String getCloud_type() {
        return cloud_type;
    }

    public void setCloud_type(String cloud_type) {
        this.cloud_type = cloud_type;
    }

    public String getDelta_t() {
        return delta_t;
    }

    public void setDelta_t(String delta_t) {
        this.delta_t = delta_t;
    }

    public String getGust_kmh() {
        return gust_kmh;
    }

    public void setGust_kmh(String gust_kmh) {
        this.gust_kmh = gust_kmh;
    }

    public String getGust_kt() {
        return gust_kt;
    }

    public void setGust_kt(String gust_kt) {
        this.gust_kt = gust_kt;
    }

    public String getAir_temp() {
        return air_temp;
    }

    public void setAir_temp(String air_temp) {
        this.air_temp = air_temp;
    }

    public String getDewpt() {
        return dewpt;
    }

    public void setDewpt(String dewpt) {
        this.dewpt = dewpt;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public String getPress_qnh() {
        return press_qnh;
    }

    public void setPress_qnh(String press_qnh) {
        this.press_qnh = press_qnh;
    }

    public String getPress_msl() {
        return press_msl;
    }

    public void setPress_msl(String press_msl) {
        this.press_msl = press_msl;
    }

    public String getPress_tend() {
        return press_tend;
    }

    public void setPress_tend(String press_tend) {
        this.press_tend = press_tend;
    }

    public String getRain_trace() {
        return rain_trace;
    }

    public void setRain_trace(String rain_trace) {
        this.rain_trace = rain_trace;
    }

    public String getRel_hum() {
        return rel_hum;
    }

    public void setRel_hum(String rel_hum) {
        this.rel_hum = rel_hum;
    }

    public String getSea_state() {
        return sea_state;
    }

    public void setSea_state(String sea_state) {
        this.sea_state = sea_state;
    }

    public String getSwell_dir_worded() {
        return swell_dir_worded;
    }

    public void setSwell_dir_worded(String swell_dir_worded) {
        this.swell_dir_worded = swell_dir_worded;
    }

    public String getSwell_height() {
        return swell_height;
    }

    public void setSwell_height(String swell_height) {
        this.swell_height = swell_height;
    }

    public String getSwell_period() {
        return swell_period;
    }

    public void setSwell_period(String swell_period) {
        this.swell_period = swell_period;
    }

    public String getVis_km() {
        return vis_km;
    }

    public void setVis_km(String vis_km) {
        this.vis_km = vis_km;
    }

    public String getWeather() {
        return weather;
    }

    public void setWeather(String weather) {
        this.weather = weather;
    }

    public String getWind_dir() {
        return wind_dir;
    }

    public void setWind_dir(String wind_dir) {
        this.wind_dir = wind_dir;
    }

    public String getWind_spd_kmh() {
        return wind_spd_kmh;
    }

    public void setWind_spd_kmh(String wind_spd_kmh) {
        this.wind_spd_kmh = wind_spd_kmh;
    }

    public String getWind_spd_kt() {
        return wind_spd_kt;
    }

    public void setWind_spd_kt(String wind_spd_kt) {
        this.wind_spd_kt = wind_spd_kt;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "sort_order=" + sort_order +
                ", wmo='" + wmo + '\'' +
                ", name='" + name + '\'' +
                ", history_product='" + history_product + '\'' +
                ", local_date_time='" + local_date_time + '\'' +
                ", local_date_time_full='" + local_date_time_full + '\'' +
                ", aifstime_utc='" + aifstime_utc + '\'' +
                ", lat='" + lat + '\'' +
                ", lon='" + lon + '\'' +
                ", apparent_t='" + apparent_t + '\'' +
                ", cloud='" + cloud + '\'' +
                ", cloud_base_m='" + cloud_base_m + '\'' +
                ", cloud_oktas='" + cloud_oktas + '\'' +
                ", cloud_type_id='" + cloud_type_id + '\'' +
                ", cloud_type='" + cloud_type + '\'' +
                ", delta_t='" + delta_t + '\'' +
                ", gust_kmh='" + gust_kmh + '\'' +
                ", gust_kt='" + gust_kt + '\'' +
                ", air_temp='" + air_temp + '\'' +
                ", dewpt='" + dewpt + '\'' +
                ", press='" + press + '\'' +
                ", press_qnh='" + press_qnh + '\'' +
                ", press_msl='" + press_msl + '\'' +
                ", press_tend='" + press_tend + '\'' +
                ", rain_trace='" + rain_trace + '\'' +
                ", rel_hum='" + rel_hum + '\'' +
                ", sea_state='" + sea_state + '\'' +
                ", swell_dir_worded='" + swell_dir_worded + '\'' +
                ", swell_height='" + swell_height + '\'' +
                ", swell_period='" + swell_period + '\'' +
                ", vis_km='" + vis_km + '\'' +
                ", weather='" + weather + '\'' +
                ", wind_dir='" + wind_dir + '\'' +
                ", wind_spd_kmh='" + wind_spd_kmh + '\'' +
                ", wind_spd_kt='" + wind_spd_kt + '\'' +
                '}';
    }
}
