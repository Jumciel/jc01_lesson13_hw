package com.training.jc.book;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//import com.training.jc.library.Book;

public class Library {

	private List<Book> books = new ArrayList<>();

	public Library() {

	}

	public Library(List<Book> books) {
		this.books = books;
	}

	public boolean add(Book book) {
		return books.add(book);
	}

	public boolean delete(int idBook) {
		int deleteIndex = -1;
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getId() == idBook) {
				deleteIndex = i;
				break;
			}
		}
		if (deleteIndex < 0) {
			return false;
		}
		books.remove(deleteIndex);
		return true;
	}

	public void showBook() {
		System.out.println("----------------------Library----------------------");
		for (int i = 0; i < books.size(); i++) {
			Book b = books.get(i);
			System.out.println("Book: id: " + b.getId());
			System.out.println("\t title: " + b.getTitle());
			System.out.println("\t author: " + b.getAuthor());
			System.out.println("\t publication:" + b.getPublication());
			System.out.println("\t yearL:" + b.getYear());
			System.out.println("\t pages:" + b.getPages());
			System.out.println("\t price: " + b.getPrice());
			System.out.println("\t binding:" + b.getBinding());
			System.out.println("-------------------------------------------------");
		}
		System.out.println("-------------------------------------------------");
	}

	public void showBookAuthor(String author) {
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getAuthor().equals(author)) {
				Book b = books.get(i);
				System.out.println("Book: id: " + b.getId());
				System.out.println("\t title: " + b.getTitle());
				System.out.println("\t author: " + b.getAuthor());
				System.out.println("\t publication:" + b.getPublication());
				System.out.println("\t yearL:" + b.getYear());
				System.out.println("\t pages:" + b.getPages());
				System.out.println("\t price: " + b.getPrice());
				System.out.println("\t binding:" + b.getBinding());
				System.out.println("-------------------------------------------------");
			}
		}
	}

	public void showBookPublication(String publication) {
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getPublication().equals(publication)) {
				Book b = books.get(i);
				System.out.println("Book: id: " + b.getId());
				System.out.println("\t title: " + b.getTitle());
				System.out.println("\t author: " + b.getAuthor());
				System.out.println("\t publication:" + b.getPublication());
				System.out.println("\t yearL:" + b.getYear());
				System.out.println("\t pages:" + b.getPages());
				System.out.println("\t price: " + b.getPrice());
				System.out.println("\t binding:" + b.getBinding());
				System.out.println("-------------------------------------------------");
			}
		}
	}
	public void showBookYear(int year) {
		for (int i = 0; i < books.size(); i++) {
			if (books.get(i).getYear() > year) {
				Book b = books.get(i);
				System.out.println("Book: id: " + b.getId());
				System.out.println("\t title: " + b.getTitle());
				System.out.println("\t author: " + b.getAuthor());
				System.out.println("\t publication:" + b.getPublication());
				System.out.println("\t yearL:" + b.getYear());
				System.out.println("\t pages:" + b.getPages());
				System.out.println("\t price: " + b.getPrice());
				System.out.println("\t binding:" + b.getBinding());
				System.out.println("-------------------------------------------------");
			}
		}
	}

	@Override
	public int hashCode() {
		return Objects.hash(books);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Library other = (Library) obj;
		return Objects.equals(books, other.books);
	}

}
