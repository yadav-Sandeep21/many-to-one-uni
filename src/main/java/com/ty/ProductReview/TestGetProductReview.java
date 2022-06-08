package com.ty.ProductReview;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestGetProductReview {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Review review=entityManager.find(Review.class, 1);
		if(review!=null) {
			System.out.println(review.getProduct());
			System.out.println(review.getStatus());
			System.out.println(review.getRating());
		}
		else
		{
			System.out.println("No review!");
		}
	}

}
