package com.qa.service.repository;

public interface BookRepository {

	String getAllBooks();

	String addBook(String book);

	String updateBook(Long id, String bookToUpdate);

	String deleteBook(Long id);

}