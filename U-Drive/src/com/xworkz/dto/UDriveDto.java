package com.xworkz.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UDriveDto {
	
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
