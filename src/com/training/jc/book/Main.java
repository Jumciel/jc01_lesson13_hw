package com.training.jc.book;

public class Main {

	public static void main(String[] args) {
		Book b1 = new Book(1, "Java", "Gosling", "Minsk", 2014, 1902, 320, "Delo");  
		Book b2 = new Book(2, "C++", "Straustrup", "Mogilev", 2010, 2800, 540, "Thermal"); 
		Book b3 = new Book(3, "Kotlin", "Jemerov", "Grodno", 2013, 943, 217, "Stitching"); 
		Book b4 = new Book(4, "C#", "Heilsberg", "Minsk", 2013, 1080, 340, "Thermal"); 
		Book b5 = new Book(5, "python", "Rossum", "Minsk", 2024, 965, 600, "Delo"); 
		Book b6 = new Book(6, "JavaPro", "Gosling", "Vitebsk", 2022, 1190, 180, "Thermal"); 
		Library lib = new Library();
		lib.add(b1);
		lib.add(b2);
		lib.add(b3);
		lib.add(b4);
		lib.add(b5);
		lib.add(b6);
		//lib.showBookAuthor("Gosling");
		//lib.showBookPublication("Minsk");
		lib.showBookYear(2014);
	}

}
