package com.example.spring_jdbc_sample;

public class Book {

	private Integer id;
	private String title;
	private Integer price;
	// private Integer category_id;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Integer getPrice() {
		return price;
	}

	public void setPrice(Integer price) {
		this.price = price;
	}

//	public Integer getCategory_id() {
//		return category_id;
//	}
//
//	public void setCategory_id(Integer category_id) {
//		this.category_id = category_id;
//	}

}
