package com.jpatest.test;

import java.util.Date;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.jpatest.entities.Book;

import com.jpatest.entities.SamplePK;
import com.jpatest.entities.Signature;

public class MainTest {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpatest");
		
		EntityManager em = emf.createEntityManager();
		
		
		em.getTransaction().begin();
		/*
		Signature s = new Signature();
		s.setDescription("Database");
		em.persist(s);
		*/
		Signature s = em.find(Signature.class, 1);
		/*
		Book b= new Book();
				
		b.setTitle("jpa api");
		b.setIsbn("3213-3213");
		b.setSignature(s);
		em.persist(b);
		
		*/
		//Book b = em.find(Book.class, 1);
		
		List<Book> bs= em.createQuery("select b from com.jpatest.entities.Book b").getResultList();
		for(Book b: bs) {
		System.out.print(b.getTitle());
		System.out.print(b.getSignature().getDescription());
		}
		
	/*
		SamplePK pk = new SamplePK();
		pk.setBook_id(b.getId());
		pk.setNumber(1);
		
		Sample sample = new Sample();
		sample.setBook(b);
		sample.setDate_adq(new Date());
		sample.setId(pk);
		
		*/
		em.getTransaction().commit();
	}
		
	}


