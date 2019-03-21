package com.cit.rt.entity;

import javax.persistence.*;

@Entity
@Table(name = "app_settings")
public class AppSettings {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(nullable = true, name = "settlement_id")
    private Settlement settlement;

    @Column(name = "last_name", length = 20, nullable = false)
    private String lastName;

    @Column(name = "first_name", length = 20, nullable = false)
    private String firstName;

    @Column(name = "phone", length = 12, nullable = false)
    private String phone;

    public AppSettings() {
    }

    public AppSettings(Settlement settlement, String lastName, String firstName, String phone) {
        this.settlement = settlement;
        this.lastName = lastName;
        this.firstName = firstName;
        this.phone = phone;
    }

    public int getId() {
        return id;
    }

    public Settlement getSettlement() {
        return settlement;
    }

    public void setSettlement(Settlement settlement) {
        this.settlement = settlement;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "AppSettings{" +
                "id=" + id +
                ", settlement=" + settlement +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
