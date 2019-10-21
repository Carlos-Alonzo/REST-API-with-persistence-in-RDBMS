package com.udacity.course3.reviews.entities;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="Products")
public class Product
{
	@OneToMany
	private List<Review> reviews = new ArrayList<>();

	public List<Review> getReviews() {		return reviews; }
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productId;

	@Column
	private String brand;

	@Column
	private String name;

	@Column
	private String description;

	@Column
	private String productcode;

	@Column
	private Date createdon;

	public String getProductcode()	{ return productcode;	}

	public void setProductcode(String productcode) 	{		this.productcode = productcode; }

	public Date getCreatedon()	{ return createdon;	}

	public void setCreatedon(Date createdon)	{ this.createdon = createdon;	}

	public int getProductId()	{		return productId;	}

	public void setProductId(int productId)	{		this.productId = productId;	}

	public String getBrand()	{		return brand;	}

	public void setBrand(String brand)	{		this.brand = brand; 	}

	public String getName() 	{		return name; 	}

	public void setName(String name) 	{		this.name = name; 	}

	public String getDescription()	{		return description;	}

	public void setDescription(String description) 	{		this.description = description; 	}

}
