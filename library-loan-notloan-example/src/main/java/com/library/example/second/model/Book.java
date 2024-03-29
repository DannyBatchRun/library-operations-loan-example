package com.library.example.second.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Book {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long idBook;
	private String name;
	private String author;
	private String genre;
	private boolean loan = false;
	
	public Book() {
		
	}

	public Book(String name, String author, String genre) {
		this.name = name;
		this.author = author;
		this.genre = genre;
	}

	public long getIdBook() {
		return idBook;
	}

	public String getName() {
		return name;
	}

	public String getAuthor() {
		return author;
	}

	public String getGenre() {
		return genre;
	}
	
	public boolean getLoan() {
		return loan;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public void setLoan(boolean loan) {
		this.loan = loan;
	}

	@Override
	public String toString() {
		String loanOrNot = "";
		if (!loan) {
			loanOrNot = "Actually not on loan.";
		} else if (loan) {
			loanOrNot = "On Loan.";
		}
		return "Book [idBook=" + idBook + ", name=" + name + ", author=" + author + ", genre=" + genre + ". " + loanOrNot + "]";
	}

}
