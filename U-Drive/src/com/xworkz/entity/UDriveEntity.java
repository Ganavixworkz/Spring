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
@Table(name="udrive_info")
public class UDriveEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="d_id")
private int id;
private String userName;
private long phoneNumber;
private String email;
private long aadharNo;
private String panNo;
private int duration;
private String userDl;
private double amount;
private String address;


}
