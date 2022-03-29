package com.example.MyWeather.controller;

import com.example.MyWeather.Model.Weather;
import com.example.MyWeather.service.WeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(maxAge = 3600)
public class WeatherController {
    @Autowired
    WeatherService weatherService;
/* Get the weather by Id */
    @GetMapping("/weather/{location}")
    public ResponseEntity<?> getWeatherByID(@PathVariable String location) {
       Weather latestWeather= weatherService.getWeather(location);
       return ResponseEntity.status(HttpStatus.OK).body(latestWeather);
    }
    /* Get lsit of all location */
    @GetMapping("/allLocation/")
    public ResponseEntity<?> getLocationList() {
        List<String> locationList= weatherService.getLocationList();
        return ResponseEntity.status(HttpStatus.OK).body(locationList);
    }

}
