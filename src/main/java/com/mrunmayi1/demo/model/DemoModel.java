package com.mrunmayi1.demo.model;


import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;

@Entity
@Table(name="demo_model")
public class DemoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @NotBlank
    private String name;
    @Column(name="contact_number")
    private String contactNumber;
    @NotBlank
    private String location;

    public DemoModel(Integer id, String name, String contactNumber, String location) {
        this.id = id;
        this.name = name;
        this.contactNumber = contactNumber;
        this.location = location;
    }

    public DemoModel() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}

