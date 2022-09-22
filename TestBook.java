package com.inheritance_interface.bll;

public class TestBook {

	public static void main(String[] args) {
	Author aut=new Author("Avi","abc@gmail.com");
		
		Book book=new Book("1598745632158","JAVA",aut,1000.0);
		System.out.println(book);
		System.out.println(book.getAuthor().getName());
		
		Book book1=new Book("2569845632145","C++",aut,859.50,2);
		System.out.println(book1);	
		System.out.println(book1.getAuthor().getName());
	
		 
		
		System.out.println(aut.getName()); 
	}

	}


