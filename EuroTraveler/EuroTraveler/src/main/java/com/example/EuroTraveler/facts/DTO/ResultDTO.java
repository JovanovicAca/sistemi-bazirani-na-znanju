package com.example.EuroTraveler.facts.DTO;

import com.example.EuroTraveler.facts.Enums.Budget;
import com.example.EuroTraveler.facts.Enums.Distance;
import com.example.EuroTraveler.facts.Enums.Weather;

public class ResultDTO {
    private Budget budget;
    private Distance distance;
    private Weather weather;

    public ResultDTO() {
    }

    public Weather getWeather() {
        return weather;
    }

    public void setWeather(Weather weather) {
        this.weather = weather;
    }

    public Budget getBudget() {
        return budget;
    }

    public void setBudget(Budget budget) {
        this.budget = budget;
    }

    public Distance getDistance() {
        return distance;
    }

    public void setDistance(Distance distance) {
        this.distance = distance;
    }
}
