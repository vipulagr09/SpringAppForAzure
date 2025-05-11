package com.example.elk.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@NoArgsConstructor
@ToString
@Data
@Entity
@Table(name = "user_info")
public class User {

	 @Id
	@Column(name = "id")
	private int id;
	
	 @Column(name = "name")
	private String name ;
	 
	  @Column(name = "city")
	private String city;


}
