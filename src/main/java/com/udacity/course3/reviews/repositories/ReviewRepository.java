package com.udacity.course3.reviews.repositories;

import com.udacity.course3.reviews.entities.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer>
{
	List<Review> findAllReviewsByProduct_productid(int productid);
}
