package com.jpatest.entities;

import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity(name="libros")
public class Book{


		@Id
		@GeneratedValue
		private int id;
		
		@Column(name="titulo", nullable=false, length=100)		
		private String title;
		
		
		private String isbn;
		
		@ManyToOne
		@JoinColumn(name="signature_id")
		private Signature signature;
	
}
