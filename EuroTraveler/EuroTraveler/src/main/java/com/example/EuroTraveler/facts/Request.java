package com.example.EuroTraveler.facts;

import com.example.EuroTraveler.facts.Enums.AccommodationType;
import com.example.EuroTraveler.facts.Enums.Interests;
import com.example.EuroTraveler.facts.Enums.TransportType;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.*;

@Entity
@Table(name = "request")
public class Request implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "transport_type")
    private TransportType transportType;

    @Column(name = "age_category")
    private List<Integer> ageCategory = new ArrayList<>();

    @Column(name = "budget")
    private Double budget;

    @Column(name = "interests")
    private Set<Interests> interests = new HashSet<>();

    @Column(name = "distance")
    private Double distance;

    @Column(name = "dateFrom")
    private LocalDate dateFrom;

    @Column(name = "dateTo")
    private LocalDate dateTo;

    @Column(name = "passenger_number")
    private Integer passengerNumber;

    @Column(name = "accommodationType")
    private AccommodationType accommodationType;

    public Request() {

    }

    public Request(Long id, TransportType transportType, List<Integer> age_category, Double budget,
                   Set<Interests> interests, Double distance, LocalDate dateFrom, LocalDate dateTo,
                   Integer passengerNumber, AccommodationType accommodationType) {
        this.id = id;
        this.transportType = transportType;
        this.ageCategory = age_category;
        this.budget = budget;
        this.interests = interests;
        this.distance = distance;
        this.dateFrom = dateFrom;
        this.dateTo = dateTo;
        this.passengerNumber = passengerNumber;
        this.accommodationType = accommodationType;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Request)) return false;
        Request request = (Request) o;
        return Objects.equals(id, request.id) && transportType == request.transportType
                && Objects.equals(ageCategory, request.ageCategory) && Objects.equals(budget, request.budget)
                && Objects.equals(interests, request.interests) && Objects.equals(distance, request.distance)
                && Objects.equals(dateFrom, request.dateFrom) && Objects.equals(dateTo, request.dateTo)
                && Objects.equals(passengerNumber, request.passengerNumber)
                && accommodationType == request.accommodationType;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, transportType, ageCategory, budget, interests, distance,
                            dateFrom, dateTo, passengerNumber, accommodationType);
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

    public List<Integer> getAgeCategory() {
        return ageCategory;
    }

    public void setAgeCategory(List<Integer> ageCategory) {
        this.ageCategory = ageCategory;
    }

    public Double getBudget() {
        return budget;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public Set<Interests> getInterests() {
        return interests;
    }

    public void setInterests(Set<Interests> interests) {
        this.interests = interests;
    }

    public Double getDistance() {
        return distance;
    }

    public void setDistance(Double distance) {
        this.distance = distance;
    }

    public LocalDate getDateFrom() {
        return dateFrom;
    }

    public void setDateFrom(LocalDate dateFrom) {
        this.dateFrom = dateFrom;
    }

    public LocalDate getDateTo() {
        return dateTo;
    }

    public void setDateTo(LocalDate dateTo) {
        this.dateTo = dateTo;
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
}