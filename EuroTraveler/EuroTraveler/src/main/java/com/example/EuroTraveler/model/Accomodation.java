package com.example.EuroTraveler.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.*;

/**
 * A Accomodation.
 */
@Entity
@Table(name = "accomodation")
public class Accomodation implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "rating")
    private Double rating;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JsonIgnoreProperties(value = { "airports", "busStations", "trainStations", "accomodations" }, allowSetters = true)
    private Destination destination;

    @OneToMany(mappedBy = "accomodation")
    @JsonIgnoreProperties(value = { "accomodation", "query" }, allowSetters = true)
    private Set<AccomodationType> accomodationTypes = new HashSet<>();

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public Accomodation id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getRating() {
        return this.rating;
    }

    public Accomodation rating(Double rating) {
        this.setRating(rating);
        return this;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getDescription() {
        return this.description;
    }

    public Accomodation description(String description) {
        this.setDescription(description);
        return this;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Destination getDestination() {
        return this.destination;
    }

    public void setDestination(Destination destination) {
        this.destination = destination;
    }

    public Accomodation destination(Destination destination) {
        this.setDestination(destination);
        return this;
    }

    public Set<AccomodationType> getAccomodationTypes() {
        return this.accomodationTypes;
    }

    public void setAccomodationTypes(Set<AccomodationType> accomodationTypes) {
        if (this.accomodationTypes != null) {
            this.accomodationTypes.forEach(i -> i.setAccomodation(null));
        }
        if (accomodationTypes != null) {
            accomodationTypes.forEach(i -> i.setAccomodation(this));
        }
        this.accomodationTypes = accomodationTypes;
    }

    public Accomodation accomodationTypes(Set<AccomodationType> accomodationTypes) {
        this.setAccomodationTypes(accomodationTypes);
        return this;
    }

    public Accomodation addAccomodationType(AccomodationType accomodationType) {
        this.accomodationTypes.add(accomodationType);
        accomodationType.setAccomodation(this);
        return this;
    }

    public Accomodation removeAccomodationType(AccomodationType accomodationType) {
        this.accomodationTypes.remove(accomodationType);
        accomodationType.setAccomodation(null);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Accomodation)) {
            return false;
        }
        return id != null && id.equals(((Accomodation) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "Accomodation{" +
            "id=" + getId() +
            ", rating=" + getRating() +
            ", description='" + getDescription() + "'" +
            "}";
    }
}
