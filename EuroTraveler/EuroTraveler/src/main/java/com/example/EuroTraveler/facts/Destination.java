package com.example.EuroTraveler.facts;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

/**
 * A Destination.
 */
@Entity
@Table(name = "destination")
public class Destination implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "country")
    private String country;

    @Column(name = "city")
    private String city;

    @Column(name = "average_temperature")
    private Double averageTemperature;

    @OneToMany(mappedBy = "destination")
    @JsonIgnoreProperties(value = { "destination" }, allowSetters = true)
    private Set<Airport> airports = new HashSet<>();

    @OneToMany(mappedBy = "destination")
    @JsonIgnoreProperties(value = { "destination" }, allowSetters = true)
    private Set<BusStation> busStations = new HashSet<>();

    @OneToMany(mappedBy = "destination")
    @JsonIgnoreProperties(value = { "destination" }, allowSetters = true)
    private Set<TrainStation> trainStations = new HashSet<>();

    @OneToMany(mappedBy = "destination")
    @JsonIgnoreProperties(value = { "destination", "accomodationTypes" }, allowSetters = true)
    private Set<Accomodation> accomodations = new HashSet<>();

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public Destination id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCountry() {
        return this.country;
    }

    public Destination country(String country) {
        this.setCountry(country);
        return this;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getCity() {
        return this.city;
    }

    public Destination city(String city) {
        this.setCity(city);
        return this;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Double getAverageTemperature() {
        return this.averageTemperature;
    }

    public Destination averageTemperature(Double averageTemperature) {
        this.setAverageTemperature(averageTemperature);
        return this;
    }

    public void setAverageTemperature(Double averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public Set<Airport> getAirports() {
        return this.airports;
    }

    public void setAirports(Set<Airport> airports) {
        if (this.airports != null) {
            this.airports.forEach(i -> i.setDestination(null));
        }
        if (airports != null) {
            airports.forEach(i -> i.setDestination(this));
        }
        this.airports = airports;
    }

    public Destination airports(Set<Airport> airports) {
        this.setAirports(airports);
        return this;
    }

    public Destination addAirport(Airport airport) {
        this.airports.add(airport);
        airport.setDestination(this);
        return this;
    }

    public Destination removeAirport(Airport airport) {
        this.airports.remove(airport);
        airport.setDestination(null);
        return this;
    }

    public Set<BusStation> getBusStations() {
        return this.busStations;
    }

    public void setBusStations(Set<BusStation> busStations) {
        if (this.busStations != null) {
            this.busStations.forEach(i -> i.setDestination(null));
        }
        if (busStations != null) {
            busStations.forEach(i -> i.setDestination(this));
        }
        this.busStations = busStations;
    }

    public Destination busStations(Set<BusStation> busStations) {
        this.setBusStations(busStations);
        return this;
    }

    public Destination addBusStation(BusStation busStation) {
        this.busStations.add(busStation);
        busStation.setDestination(this);
        return this;
    }

    public Destination removeBusStation(BusStation busStation) {
        this.busStations.remove(busStation);
        busStation.setDestination(null);
        return this;
    }

    public Set<TrainStation> getTrainStations() {
        return this.trainStations;
    }

    public void setTrainStations(Set<TrainStation> trainStations) {
        if (this.trainStations != null) {
            this.trainStations.forEach(i -> i.setDestination(null));
        }
        if (trainStations != null) {
            trainStations.forEach(i -> i.setDestination(this));
        }
        this.trainStations = trainStations;
    }

    public Destination trainStations(Set<TrainStation> trainStations) {
        this.setTrainStations(trainStations);
        return this;
    }

    public Destination addTrainStation(TrainStation trainStation) {
        this.trainStations.add(trainStation);
        trainStation.setDestination(this);
        return this;
    }

    public Destination removeTrainStation(TrainStation trainStation) {
        this.trainStations.remove(trainStation);
        trainStation.setDestination(null);
        return this;
    }

    public Set<Accomodation> getAccomodations() {
        return this.accomodations;
    }

    public void setAccomodations(Set<Accomodation> accomodations) {
        if (this.accomodations != null) {
            this.accomodations.forEach(i -> i.setDestination(null));
        }
        if (accomodations != null) {
            accomodations.forEach(i -> i.setDestination(this));
        }
        this.accomodations = accomodations;
    }

    public Destination accomodations(Set<Accomodation> accomodations) {
        this.setAccomodations(accomodations);
        return this;
    }

    public Destination addAccomodation(Accomodation accomodation) {
        this.accomodations.add(accomodation);
        accomodation.setDestination(this);
        return this;
    }

    public Destination removeAccomodation(Accomodation accomodation) {
        this.accomodations.remove(accomodation);
        accomodation.setDestination(null);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Destination)) {
            return false;
        }
        return id != null && id.equals(((Destination) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Destination{" +
                "id=" + getId() +
                ", country='" + getCountry() + "'" +
                ", city='" + getCity() + "'" +
                ", averageTemperature=" + getAverageTemperature() +
                "}";
    }
}
