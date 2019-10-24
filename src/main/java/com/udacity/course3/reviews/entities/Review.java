package com.udacity.course3.reviews.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Date;

@Entity
@Table(name="reviews")
public class Review
{
	public Review()	{ reviewdate = new Timestamp(System.currentTimeMillis());}

	public Review(int rating, String title, String comment, String reviewer, int productid)
	{
		this.rating = rating;
		this.title = title;
		this.comment = comment;
		this.reviewer = reviewer;
		reviewdate = new Timestamp(System.currentTimeMillis());
	}

	@ManyToOne
	@JoinColumn(name ="productid", nullable = false)
	private Product product;// = new Product();

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int reviewid;

	@Column
	private int rating;

	@Column
	private String title;

	@Column
	private String comment;

	@Column
	private String reviewer;

	@Column
	private Timestamp reviewdate;

	public Date getReviewdate() { return reviewdate;	}

	public void setReviewdate(Timestamp reviewdate) 	{		this.reviewdate = reviewdate; }

	public String getTitle() { return title;	}

	public void setTitle(String title) 	{		this.title = title; }

	public int getReviewId()	{		return reviewid;	}

	public void setReviewId(int reviewId)	{		this.reviewid = reviewId;	}

	public int getRating()	{		return rating;	}

	public void setRating(int rating)	{		this.rating = rating; 	}

	public String getComment() 	{		return comment; 	}

	public void setComment(String comment) 	{		this.comment = comment; 	}

	public String getReviewer()	{		return reviewer;	}

	public void setReviewer(String reviewer) 	{		this.reviewer = reviewer; 	}

	public int getReviewid()
	{
		return reviewid;
	}

	public void setReviewid(int reviewid)
	{
		this.reviewid = reviewid;
	}

	public Product getProduct()
	{
		return product;
	}

	public void setProduct(Product product)
	{
		this.product = product;
	}
}
