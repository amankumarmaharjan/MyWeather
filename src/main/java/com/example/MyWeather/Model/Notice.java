package com.example.MyWeather.Model;

public class Notice {
    private String copyright;
    private String copyright_url;
    private String disclaimer_url;
    private String feedback_url;

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public String getCopyright_url() {
        return copyright_url;
    }

    public void setCopyright_url(String copyright_url) {
        this.copyright_url = copyright_url;
    }

    public String getDisclaimer_url() {
        return disclaimer_url;
    }

    public void setDisclaimer_url(String disclaimer_url) {
        this.disclaimer_url = disclaimer_url;
    }

    public String getFeedback_url() {
        return feedback_url;
    }

    public void setFeedback_url(String feedback_url) {
        this.feedback_url = feedback_url;
    }

    @Override
    public String toString() {
        return "Notice{" +
                "copyright='" + copyright + '\'' +
                ", copyright_url='" + copyright_url + '\'' +
                ", disclaimer_url='" + disclaimer_url + '\'' +
                ", feedback_url='" + feedback_url + '\'' +
                '}';
    }
}
