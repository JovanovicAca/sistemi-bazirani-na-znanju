package com.example.EuroTraveler.facts;

import com.example.EuroTraveler.facts.Enums.*;
import com.example.EuroTraveler.facts.Enums.Interests;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Response implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "transport_type")
    private TransportType transportType;

    @Column(name = "age_category")
    private AgeCategory ageCategory;

    @Column(name = "budget")
    private Budget budget;

    @Column(name = "interests")
    private Set<Interests> interests = new HashSet<>();

    @Column(name = "distance")
    private Distance distance;

    @Column(name = "vacation_type")
    private VacationType vacationType;

    @Column(name = "country_type")
    private CountryType countryType;

    @Column(name = "passenger_number")
    private Integer passengerNumber;

    @Column(name = "accommodationType")
    private AccommodationType accommodationType;

    public Response() {

    }

    public Response(Long id, TransportType transportType, AgeCategory ageCategory,
                    Budget budget, Set<Interests> interests, Distance distance, CountryType countryType,
                    VacationType vacationType, Integer passengerNumber, AccommodationType accommodationType) {
        this.id = id;
        this.transportType = transportType;
        this.ageCategory = ageCategory;
        this.budget = budget;
        this.interests = interests;
        this.distance = distance;
        this.countryType = countryType;
        this.vacationType = vacationType;
        this.passengerNumber = passengerNumber;
        this.accommodationType = accommodationType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Response)) return false;
        Response request = (Response) o;
        return Objects.equals(id, request.id) && Objects.equals(transportType, request.transportType)
                && ageCategory == request.ageCategory && budget == request.budget
                && countryType == request.countryType
                && Objects.equals(interests, request.interests) && distance == request.distance
                && vacationType == request.vacationType && Objects.equals(passengerNumber, request.passengerNumber)
                && Objects.equals(accommodationType, request.accommodationType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, transportType, ageCategory, budget, interests, distance,
                            vacationType, passengerNumber, accommodationType,countryType);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TransportType getTransportType() {
        return transportType;
    }

    public void setTransportType(TransportType transportType) {
        this.transportType = transportType;
    }

    public AgeCategory getAgeCategory() {
        return ageCategory;
    }

    public void setAgeCategory(AgeCategory ageCategory) {
        this.ageCategory = ageCategory;
    }

    public Budget getBudget() {
        return budget;
    }

    public void setBudget(Budget budget) {
        this.budget = budget;
    }

    public Set<Interests> getInterests() {
        return interests;
    }

    public void setInterests(Set<Interests> interests) {
        this.interests = interests;
    }

    public Distance getDistance() {
        return distance;
    }

    public void setDistance(Distance distance) {
        this.distance = distance;
    }

    public VacationType getVacationType() {
        return vacationType;
    }

    public void setVacationType(VacationType vacationType) {
        this.vacationType = vacationType;
    }

    public Integer getPassengerNumber() {
        return passengerNumber;
    }

    public void setPassengerNumber(Integer passengerNumber) {
        this.passengerNumber = passengerNumber;
    }

    public AccommodationType getAccommodationType() {
        return accommodationType;
    }

    public void setAccommodationType(AccommodationType accommodationType) {
        this.accommodationType = accommodationType;
    }

    public CountryType getCountryType() {
        return countryType;
    }

    public void setCountryType(CountryType countryType) {
        this.countryType = countryType;
    }

    @Override
    public String toString() {
        return "Response{" +
                "id=" + id +
                ", transportType=" + transportType +
                ", ageCategory=" + ageCategory +
                ", budget=" + budget +
                ", interests=" + interests +
                ", distance=" + distance +
                ", vacationType=" + vacationType +
                ", countryType=" + countryType +
                ", passengerNumber=" + passengerNumber +
                ", accommodationType=" + accommodationType +
                '}';
    }
}
