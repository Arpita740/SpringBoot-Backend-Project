package com.spring.sprint_evaluation_group_1.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

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

@Entity
@Table(name = "routes")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Route {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int routeId;

	@Column(name = "from_city", nullable = false)
	private String fromCity;

	@Column(name = "to_city", nullable = false)
	private String toCity;

	@Column(name = "break_points")
	private int breakPoints;

	@Column(nullable = false)
	private int duration;

	@OneToMany(mappedBy = "route")
	@JsonIgnore
	private List<Trip> trips;

}