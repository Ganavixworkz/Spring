package com.xworkz.fashionfactory.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FashionFactoryDto {
private int id;
private String userName;
private String address;
private long phoneNumber;
private String email;
}
