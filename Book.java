package com.inheritance_interface.bll;

public class Book extends Author {
	private String isbn;
	private String name;
	private Author author=null;
	private double price;
	private int qty;
	
	public Book() {//default constructor
 }
	
	//parameterized constructor for isbn,name,author,price 
	public Book(String isbn,String name, Author author, double price) {
		
		
		this.isbn=isbn;
		this.author=author;
		this.name = name;
		this.price = price;
		
	}
	
	//parameterized constructor for isbn,name,author,price and qty
	public Book(String isbn,String name,Author author,double price, int qty)
	{
		
		this.isbn=isbn;
		this.name=name;
		this.author=author;
		this.price=price;
		this.qty=qty;
	}

	public String getISBN() {
		return isbn;
	}
	
	public String getName() {
		return name;
	}

	public Author getAuthor() {
		return author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
	
	public String getAuthorName()
	{
		return author.getName();
	}


	@Override
	public String toString() {
		return "Book [isbn=" + isbn + ", name=" + name + ", author=" + author + ", price=" + price + ", qty=" + qty
				+ "]";
	}
	
	
	
	
	
}
