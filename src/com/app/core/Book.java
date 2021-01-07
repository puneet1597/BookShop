package com.app.core;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
public class Book {
  private String title;
  private Category category;
  private double price;
  private LocalDate publishDate;
  private static int quantity;
  private int rating;
  private Author authors[];
  static {
	  quantity=0;
  }
  
  
  
  public Category getCategory() {
	return category;
}



public Book(String title, Category category, double price, LocalDate publishDate, int rating, Author[] authors) {
	super();
	this.title = title;
	this.category = category;
	this.price = price;
	this.publishDate = publishDate;
	this.rating = rating;
	this.authors = authors;
}



public void setCategory(Category category) {
	this.category = category;
}



public String getTitle() {
	return title;
}



public double getPrice() {
	return price;
}



public void setPrice(double price) {
	this.price = price;
}



public void setTitle(String title) {
	this.title = title;
}






@Override
public String toString() {
	return "Book [title=" + title + ", category=" + category + ", price=" + price + ", publishDate=" + publishDate
			+ ", rating=" + rating + ", authors=" + Arrays.toString(authors) + "]";
}

@Override
public boolean equals(Object o) {
	
	if(o instanceof Book) {
		Book b = (Book)o;
		return this.title.equals(title);
	}
	return false;
}
@Override
public int hashCode() {
	
	return this.title.hashCode();
}



}