package com.udacity.course3.reviews.entities;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name="products")
public class Product
{
	public Product()	{ createdon = new Timestamp(System.currentTimeMillis());}

	public Product( String brand, String name, String description, String productcode)
	{
		this.brand = brand;
		this.name = name;
		this.description = description;
		this.productcode = productcode;
		this.createdon = new Timestamp(System.currentTimeMillis());
	}

//	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//	@JoinColumn(name = "reviewid", nullable = false)
//	private List<Review> reviews = new ArrayList<>();
//
//	public List<Review> getReviews() {		return reviews; }

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int productid;

	@Column
	private String brand;

	@Column
	private String name;

	@Column
	private String description;

	@Column
	private String productcode;

	@Column
	private Timestamp createdon;

	public String getProductcode()	{ return productcode;	}
	public void setProductcode(String productcode) 	{		this.productcode = productcode; }
	public Date getCreatedon()	{ return createdon;	}
	public void setCreatedon(Timestamp createdon)	{ this.createdon = createdon;	}
	public int getProductId()	{		return productid;	}
	public void setProductId(int productId)	{		this.productid = productId;	}
	public String getBrand()	{		return brand;	}
	public void setBrand(String brand)	{		this.brand = brand; 	}
	public String getName() 	{		return name; 	}
	public void setName(String name) 	{		this.name = name; 	}
	public String getDescription()	{		return description;	}
	public void setDescription(String description) 	{		this.description = description; 	}

}
