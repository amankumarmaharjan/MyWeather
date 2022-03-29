package com.example.MyWeather.Model;

public class Response {
    private  Observations observations;

    public Observations getObservations() {
        return observations;
    }

    public void setObservations(Observations observations) {
        this.observations = observations;
    }

    @Override
    public String toString() {
        return "Response{" +
                "observations=" + observations +
                '}';
    }
}
