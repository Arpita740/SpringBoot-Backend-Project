package com.spring.sprint_evaluation_group_1.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Table(name = "agencies")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Agency {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int agency_id;

	@Column(nullable = false)
	private String name;

	@Column(name = "contact_person_name", nullable = false)
	private String contactPersonName;

	@Column(nullable = false)
	private String email;

	@Column(nullable = false)
	private String phone;

//    @OneToMany(mappedBy = "agency")
//    private List<Agency_office> offices;

}