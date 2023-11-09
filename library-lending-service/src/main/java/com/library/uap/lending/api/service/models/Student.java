package com.library.uap.lending.api.service.models;

import java.util.List;

public class Student {
	private Long id;
	private String studentNumber;
    private String studentName;
    private List<Book> books;
    
    // Getters and setters
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getStudentId() {
		return studentNumber;
	}
	public void setStudentId(String studentNumber) {
		this.studentNumber = studentNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
}
