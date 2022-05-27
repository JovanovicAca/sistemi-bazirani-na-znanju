package com.example.EuroTraveler.facts;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.io.Serializable;
import javax.persistence.*;

/**
 * A AccomodationType.
 */
@Entity
@Table(name = "accomodation_type")
public class AccomodationType implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @ManyToOne
    @JsonIgnoreProperties(value = { "destination", "accomodationTypes" }, allowSetters = true)
    private Accomodation accomodation;

    @ManyToOne
    @JsonIgnoreProperties(value = { "interests", "accomodationTypes", "transportTypes" }, allowSetters = true)
    private Query query;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public AccomodationType id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public AccomodationType name(String name) {
        this.setName(name);
        return this;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Accomodation getAccomodation() {
        return this.accomodation;
    }

    public void setAccomodation(Accomodation accomodation) {
        this.accomodation = accomodation;
    }

    public AccomodationType accomodation(Accomodation accomodation) {
        this.setAccomodation(accomodation);
        return this;
    }

    public Query getQuery() {
        return this.query;
    }

    public void setQuery(Query query) {
        this.query = query;
    }

    public AccomodationType query(Query query) {
        this.setQuery(query);
        return this;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof AccomodationType)) {
            return false;
        }
        return id != null && id.equals(((AccomodationType) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "AccomodationType{" +
                "id=" + getId() +
                ", name='" + getName() + "'" +
                "}";
    }
}