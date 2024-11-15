
package com.spring.sprint_evaluation_group_1.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "agency_offices")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Agency_office {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "office_id")
	private int officeId;

	@Column(name = "agency_id", nullable = false)
	private int agencyId;

	@Column(name = "office_mail", nullable = false)
	private String officeMail;

	@Column(name = "office_contact_person_name", nullable = false, length = 30)
	private String officeContactPersonName;

	@Column(name = "office_contact_number", nullable = false, length = 15)
	private String officeContactNumber;

	@Column(name = "office_address_id", nullable = false)
	private int officeAddressId;

	@ManyToOne
	@JoinColumn(name = "review_id")
	private Review review;
}