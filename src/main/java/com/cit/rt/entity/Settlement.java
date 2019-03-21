package com.cit.rt.entity;

import javax.persistence.*;

@Entity
@Table(name = "settlement")
public class Settlement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name", length = 50, nullable = false)
    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = true, name = "district_id")
    private District district;

    public Settlement() {
    }

    public Settlement(String name, District district) {
        this.name = name;
        this.district = district;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public District getDistrict() {
        return district;
    }

    public void setDistrict(District district) {
        this.district = district;
    }

    @Override
    public String toString() {
        return "Settlement{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", district=" + district +
                '}';
    }
}
