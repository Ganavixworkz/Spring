package com.xworkz.fashionfactory.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table(name="fashion_info")
@Data
@NamedQueries({
	@NamedQuery(name="findAll" , query = "select entity from FashionFactoryEntity entity"),
	@NamedQuery(name="findByEmail", query = "select entity from FashionFactoryEntity entity where entity.email=:e")
})
public class FashionFactoryEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="f_id")
	private int id;
	private String userName;
	private String address;
	private long phoneNumber;
	private String email;
}
