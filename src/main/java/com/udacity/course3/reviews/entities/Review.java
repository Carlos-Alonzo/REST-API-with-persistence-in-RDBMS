package com.udacity.course3.reviews.entities;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="Reviews")
public class Review
{
	public Review()	{ reviewdate = new Date(System.currentTimeMillis());}

	public Review(int rating, String title, String comment, String reviewer)
	{
		this.rating = rating;
		this.title = title;
		this.comment = comment;
		this.reviewer = reviewer;
		reviewdate = new Date(System.currentTimeMillis());
	}

	@ManyToOne
	private Product product = new Product();

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
	private Date reviewdate;

	public Date getReviewdate() { return reviewdate;	}

	public void setReviewdate(Date reviewdate) 	{		this.reviewdate = reviewdate; }

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

}
