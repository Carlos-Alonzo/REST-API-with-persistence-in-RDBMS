package com.udacity.course3.reviews.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="comments")
public class Comment
{
	public Comment()	{ createdon =  new Timestamp(System.currentTimeMillis());}

	public Comment(int commentid, String text)
	{
		this.commentid = commentid;
		this.text = text;
		createdon = new Timestamp(System.currentTimeMillis());
	}

	@ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
	@JoinColumn(name = "reviewid", nullable = false)
	private Review review;// = new Review();

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int commentid;

	@Column
	private String text;

	@Column
	private Timestamp createdon;

	public Review getReview()
	{
		return review;
	}

	public void setReview(Review review)
	{
		this.review = review;
	}

	public int getCommentid()
	{
		return commentid;
	}

	public void setCommentid(int commentid)
	{
		this.commentid = commentid;
	}

	public String getText()
	{
		return text;
	}

	public void setText(String text)
	{
		this.text = text;
	}

	public Timestamp getCreatedon()
	{
		return createdon;
	}

	public void setCreatedon(Timestamp createdon)
	{
		this.createdon = createdon;
	}
}
