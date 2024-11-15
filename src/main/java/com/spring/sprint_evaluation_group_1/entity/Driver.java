package com.spring.sprint_evaluation_group_1.entity;

import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "drivers")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Driver {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int driverId;

    @Column(name = "license_number", nullable = false)
    private String licenseNumber;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String phone;

    @ManyToOne
    @JoinColumn(name = "office_id")
    private Agency_office office;

    @ManyToOne
    @JoinColumn(name = "address_id")
    private Address addresses;

    @OneToMany(mappedBy = "driver1")
    private List<Trip> tripsAsDriver1;

    @OneToMany(mappedBy = "driver2")
    private List<Trip> tripsAsDriver2;

 
}