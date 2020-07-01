package com.wipro.EncapsulationAndAbstraction;

public class Encapsulation_Ex1 {
	public static void main(String[] args) {
		Author a1=new Author("Stephen Hawking","shawking@gmail.com",'M');
		Author a2=new Author("George RR Martin","georgemartin@gmail.com",'M');
		Book b1=new Book("A Brief History of Time",a1,2500.0,100);
		Book b2=new Book("Game Of Thrones",a2,1500.0,1000);
		System.out.println("Author: "+b1.getA().getName()+" wrote a book named "+b1.gettitle()+" which costs "+b1.getprice());
		System.out.println("Author: "+b2.getA().getName()+" wrote a book named "+b2.gettitle()+" which costs "+b2.getprice());
		
	}

}
