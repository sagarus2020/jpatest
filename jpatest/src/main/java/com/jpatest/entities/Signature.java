package com.jpatest.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.Data;

@Entity
@Data
public class Signature {

	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(length=100)
	private String description;
	
	@Column(length=100)
	private String code;
	
	@OneToMany (mappedBy="signature")
	private List<Book> books = new ArrayList<>();
	
}
