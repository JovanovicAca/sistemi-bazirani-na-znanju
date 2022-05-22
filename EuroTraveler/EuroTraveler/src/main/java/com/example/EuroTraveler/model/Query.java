package com.example.EuroTraveler.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

/**
 * A Query.
 */
@Entity
@Table(name = "query")
public class Query implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "average_age")
    private Double averageAge;

    @Column(name = "budget")
    private Double budget;

    @Column(name = "maximum_distance")
    private Double maximumDistance;

    @Column(name = "summer_vacation")
    private Boolean summerVacation;

    @OneToMany(mappedBy = "query")
    @JsonIgnoreProperties(value = { "query" }, allowSetters = true)
    private Set<Interests> interests = new HashSet<>();

    @OneToMany(mappedBy = "query")
    @JsonIgnoreProperties(value = { "accomodation", "query" }, allowSetters = true)
    private Set<AccomodationType> accomodationTypes = new HashSet<>();

    @OneToMany(mappedBy = "query")
    @JsonIgnoreProperties(value = { "query" }, allowSetters = true)
    private Set<TransportType> transportTypes = new HashSet<>();

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public Query id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getAverageAge() {
        return this.averageAge;
    }

    public Query averageAge(Double averageAge) {
        this.setAverageAge(averageAge);
        return this;
    }

    public void setAverageAge(Double averageAge) {
        this.averageAge = averageAge;
    }

    public Double getBudget() {
        return this.budget;
    }

    public Query budget(Double budget) {
        this.setBudget(budget);
        return this;
    }

    public void setBudget(Double budget) {
        this.budget = budget;
    }

    public Double getMaximumDistance() {
        return this.maximumDistance;
    }

    public Query maximumDistance(Double maximumDistance) {
        this.setMaximumDistance(maximumDistance);
        return this;
    }

    public void setMaximumDistance(Double maximumDistance) {
        this.maximumDistance = maximumDistance;
    }

    public Boolean getSummerVacation() {
        return this.summerVacation;
    }

    public Query summerVacation(Boolean summerVacation) {
        this.setSummerVacation(summerVacation);
        return this;
    }

    public void setSummerVacation(Boolean summerVacation) {
        this.summerVacation = summerVacation;
    }

    public Set<Interests> getInterests() {
        return this.interests;
    }

    public void setInterests(Set<Interests> interests) {
        if (this.interests != null) {
            this.interests.forEach(i -> i.setQuery(null));
        }
        if (interests != null) {
            interests.forEach(i -> i.setQuery(this));
        }
        this.interests = interests;
    }

    public Query interests(Set<Interests> interests) {
        this.setInterests(interests);
        return this;
    }

    public Query addInterests(Interests interests) {
        this.interests.add(interests);
        interests.setQuery(this);
        return this;
    }

    public Query removeInterests(Interests interests) {
        this.interests.remove(interests);
        interests.setQuery(null);
        return this;
    }

    public Set<AccomodationType> getAccomodationTypes() {
        return this.accomodationTypes;
    }

    public void setAccomodationTypes(Set<AccomodationType> accomodationTypes) {
        if (this.accomodationTypes != null) {
            this.accomodationTypes.forEach(i -> i.setQuery(null));
        }
        if (accomodationTypes != null) {
            accomodationTypes.forEach(i -> i.setQuery(this));
        }
        this.accomodationTypes = accomodationTypes;
    }

    public Query accomodationTypes(Set<AccomodationType> accomodationTypes) {
        this.setAccomodationTypes(accomodationTypes);
        return this;
    }

    public Query addAccomodationType(AccomodationType accomodationType) {
        this.accomodationTypes.add(accomodationType);
        accomodationType.setQuery(this);
        return this;
    }

    public Query removeAccomodationType(AccomodationType accomodationType) {
        this.accomodationTypes.remove(accomodationType);
        accomodationType.setQuery(null);
        return this;
    }

    public Set<TransportType> getTransportTypes() {
        return this.transportTypes;
    }

    public void setTransportTypes(Set<TransportType> transportTypes) {
        if (this.transportTypes != null) {
            this.transportTypes.forEach(i -> i.setQuery(null));
        }
        if (transportTypes != null) {
            transportTypes.forEach(i -> i.setQuery(this));
        }
        this.transportTypes = transportTypes;
    }

    public Query transportTypes(Set<TransportType> transportTypes) {
        this.setTransportTypes(transportTypes);
        return this;
    }

    public Query addTransportType(TransportType transportType) {
        this.transportTypes.add(transportType);
        transportType.setQuery(this);
        return this;
    }

    public Query removeTransportType(TransportType transportType) {
        this.transportTypes.remove(transportType);
        transportType.setQuery(null);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Query)) {
            return false;
        }
        return id != null && id.equals(((Query) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Query{" +
            "id=" + getId() +
            ", averageAge=" + getAverageAge() +
            ", budget=" + getBudget() +
            ", maximumDistance=" + getMaximumDistance() +
            ", summerVacation='" + getSummerVacation() + "'" +
            "}";
    }
}
