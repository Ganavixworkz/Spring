package com.xworkz.entity;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name="AirIndia_info")

public class AirIndiaEntity {
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name="customer_id")
		private int customerId;
		private String userName;
		private long phoneNumber;
		private String email;
		private String passportNumber;
		private String dateOfBirth;
		private String gender;
		private String countryCode;
		private String nationality;
		private String address;

}
