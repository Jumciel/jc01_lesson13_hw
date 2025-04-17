package com.training.jc.book;

import java.util.Objects;

public class Book {
	private int id;
	private String title;
	private String author;
	private String publication;
	private int year;
	private int pages;
	private double price;
	private String binding;

	public Book() {

	}

	public Book(int id, String title, String author, String publication, int year,int pages, double price, String binding) {
		this.id = id;
		this.title = title;
		this.author = author;
		this.publication = publication;
		this.year = year;
		this.pages = pages;
		this.price = price;
		this.binding = binding;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPublication() {
		return publication;
	}

	public void setPublication(String publication) {
		this.publication = publication;
	}
	
	
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBinding() {
		return binding;
	}

	public void setBinding(String binding) {
		this.binding = binding;
	}

	
	
	@Override
	public String toString() {
		return "Book [toString()=" + super.toString() + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, binding, id, pages, price, publication, title, year);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && Objects.equals(binding, other.binding) && id == other.id
				&& pages == other.pages && Double.doubleToLongBits(price) == Double.doubleToLongBits(other.price)
				&& publication == other.publication && Objects.equals(title, other.title) && year == other.year;
	}

	

}
