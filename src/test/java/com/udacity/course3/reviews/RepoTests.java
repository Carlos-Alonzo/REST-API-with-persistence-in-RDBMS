package com.udacity.course3.reviews;

import com.udacity.course3.reviews.entities.Comment;
import com.udacity.course3.reviews.entities.Product;
import com.udacity.course3.reviews.entities.Review;
import com.udacity.course3.reviews.repositories.CommentRepository;
import com.udacity.course3.reviews.repositories.ProductRepository;
import com.udacity.course3.reviews.repositories.ReviewRepository;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;

@RunWith(SpringRunner.class)
@DataJpaTest
@Sql("/db/data.sql")
public class RepoTests
{
	@Autowired
	private CommentRepository commentRepository;
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private ReviewRepository reviewRepository;

	@Test
	public void testInsertNewProduct()
	{
		Product testProduct = new Product("Lenovo", "Lenovo T450", "Lenovo t450 laptop", "123456789");
		Assert.assertNotNull(productRepository.save(testProduct));
	}

	@Test
	public void testFindProductById()
	{
		productRepository.save(new Product("Lenovo", "Lenovo T450", "Lenovo t450 laptop", "123456789"));
		Assert.assertTrue(productRepository.findById(1).get().getProductId()==1);
	}

@Test
	public void testInsertNewReview()
	{
		Review testReview = new Review();
		testReview.setProduct(productRepository.save(new Product("Lenovo", "Lenovo T450", "Lenovo t450 laptop", "123456789")));
		testReview.setReviewer("Carlos A.");
		testReview.setRating(5);
		testReview.setTitle("Wonderful product");
		testReview.setComment("I have not come across something this good");
		testReview.setReviewdate(new Timestamp(System.currentTimeMillis()));
		Assert.assertNotNull(reviewRepository.save(testReview));
	}

	@Test
	public void testInsertNewComment()
	{
		Comment testComment = new Comment();
		Review testReview = new Review();
		testReview.setProduct(productRepository.save(new Product("Lenovo", "Lenovo T450", "Lenovo t450 laptop", "123456789")));
		testReview.setReviewer("Carlos A.");
		testReview.setRating(5);
		testReview.setTitle("Wonderful product");
		testReview.setComment("I have not come across something this good");
		testReview.setReviewdate(new Timestamp(System.currentTimeMillis()));
		testComment.setReview(reviewRepository.save(testReview));
		testComment.setCreatedon(new Timestamp(System.currentTimeMillis()));
		testComment.setText(testReview.getComment());
		Assert.assertNotNull(commentRepository.save(testComment));
	}

	@Test
	public void testRetrieveAllProducts()
	{
		Assert.assertNotNull(productRepository.findAll());
	}

	@Test
	public void testRetrieveAllReviews()
	{
		Assert.assertNotNull(reviewRepository.findAll());
	}

	@Test
	public void testRetrieveAllComments()
	{
		Assert.assertNotNull(commentRepository.findAll());
	}
}
