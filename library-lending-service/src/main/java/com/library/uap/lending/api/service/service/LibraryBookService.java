package com.library.uap.lending.api.service.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.library.uap.lending.api.service.models.Book;
import com.library.uap.lending.api.service.repository.BookMapper;

import java.util.List;

@Service
public class LibraryBookService {

    @Autowired
    private BookMapper bookMapper;

    public void addBook(Book book) {
        bookMapper.insertBook(book);
    }

    public List<Book> getBooksByType(String typeCode) {
        return bookMapper.selectBooksByType(typeCode);
    }

    public List<Book> getAllBooks() {
        return bookMapper.selectAllBooks();
    }
}
