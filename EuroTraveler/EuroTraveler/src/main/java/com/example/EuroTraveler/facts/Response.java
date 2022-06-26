package com.example.EuroTraveler.facts;

import com.example.EuroTraveler.facts.Enums.*;
import com.example.EuroTraveler.facts.Enums.Interests;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "Response")
public class Response implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    //Za DESTINACIJU

    @Column(name = "name")
    private String cityName;

    @Column(name = "transport_type")
    private TransportType transportType;

    @Column(name = "age_category")
    private AgeCategory ageCategory;

    @Column(name = "average_night_price")
    private Double averageNightPrice;

    @Column(name = "accommodationType")
    private AccommodationType accommodationType;

    @Column(name = "seasonal")
    private Boolean seasonal;

    @Column(name = "season")
    private Season season;

    //Za KVERI

    private Integer daysStaying;

    @Column(name = "climate")
    private Climate climate;

    @Column(name = "budget")
    private Budget budget;

    @Column(name = "distance")
    private Distance distance;

    @Column(name = "seasonFlag")
    private Season seasonFlag;

    @Column(name = "score")
    private Integer score;

    public Response() {

    }

    public Season getSeasonFlag() {
        return seasonFlag;
    }

    public void setSeasonFlag(Season seasonFlag) {
        this.seasonFlag = seasonFlag;
    }

    public Response(Long id, TransportType transportType, AgeCategory ageCategory,
                    Budget budget, Interests interests, Distance distance, CountryType countryType,
                    VacationType vacationType, Integer passengerNumber, AccommodationType accommodationType) {
        this.id = id;
        this.transportType = transportType;
        this.ageCategory = ageCategory;
        this.budget = budget;
        this.distance = distance;
        this.accommodationType = accommodationType;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public Integer getDaysStaying() {
        return daysStaying;
    }

    public void setDaysStaying(Integer daysStaying) {
        this.daysStaying = daysStaying;
    }

    public TransportType getTransportType() {
        return transportType;
    }

    public Boolean getSeasonal() {
        return seasonal;
    }

    public void setSeasonal(Boolean seasonal) {
        this.seasonal = seasonal;
    }

    public Season getSeason() {
        return season;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    public void setTransportType(TransportType transportType) {
        this.transportType = transportType;
    }

    public Climate getClimate() {
        return climate;
    }

    public void setClimate(Climate climate) {
        this.climate = climate;
    }

    public AgeCategory getAgeCategory() {
        return ageCategory;
    }

    public void setAgeCategory(AgeCategory ageCategory) {
        this.ageCategory = ageCategory;
    }

    public Double getAverageNightPrice() {
        return averageNightPrice;
    }

    public void setAverageNightPrice(Double averageNightPrice) {
        this.averageNightPrice = averageNightPrice;
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

    public AccommodationType getAccommodationType() {
        return accommodationType;
    }

    public void setAccommodationType(AccommodationType accommodationType) {
        this.accommodationType = accommodationType;
    }
}
