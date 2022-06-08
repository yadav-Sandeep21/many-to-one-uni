package com.ty.ProductReview;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveProductReview {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Review review1=new Review();
		review1.setStatus("Like");
		review1.setRating(4);
		
		Review review2=new Review();
		review2.setStatus("DisLike");
		review2.setRating(5);
		
		Review review3=new Review();
		review3.setStatus("Like");
		review3.setRating(3);
		
		Product product=new Product();
		product.setName("POCO X2");
		product.setBrand("MI");
		product.setPrice(67000);
		
		review1.setProduct(product);
		review2.setProduct(product);
		review3.setProduct(product);
		
		entityTransaction.begin();
		entityManager.persist(product);
		entityManager.persist(review1);
		entityManager.persist(review2);
		entityManager.persist(review3);
		entityTransaction.commit();
	}

}
