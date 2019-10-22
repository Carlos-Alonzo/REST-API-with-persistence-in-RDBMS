package com.udacity.course3.reviews;

import com.udacity.course3.reviews.entities.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@RunWith(SpringRunner.class)
@DataJpaTest
public class ReviewsApplicationTests
{

	private static final String PRODUCT_PERSISTENCE_UNIT="Products";
	private static final String REVIEW_PERSISTENCE_UNIT="Reviews";

	private EntityManagerFactory ProductUnitFactory = Persistence.createEntityManagerFactory(PRODUCT_PERSISTENCE_UNIT);
	private EntityManagerFactory  ReviewUnitFactory = Persistence.createEntityManagerFactory(REVIEW_PERSISTENCE_UNIT);



	@Test
	public void contextLoads() {
	}

	@Test
	public void testProductPersistence()
	{
		EntityManager ProductEM = ProductUnitFactory.createEntityManager();
		ProductEM.getTransaction().begin();
		Product product = new Product(
										"ConAir",
										"ConAir Hair Blower",
		                              "ConAir hair blower the best blow for your hair there is",
										"978789123456"
		                              );

		ProductEM.persist(product);
		System.out.println("Product ID: " + product.getProductId());
		ProductEM.getTransaction().commit();
		ProductEM.close();
	}

}