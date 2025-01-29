package com.example.demo.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class springmvc {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)

	private long id;
	private String rollno;
	private String name;
	
	@Email
	@Size(min=4, max=8)
	private String email;
	private String password;
	private long mobileno;
	
}
