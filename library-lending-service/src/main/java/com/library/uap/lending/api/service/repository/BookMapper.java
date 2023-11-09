package com.library.uap.lending.api.service.repository;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.library.uap.lending.api.service.models.Book;

@Mapper
public interface BookMapper {

    @Insert("INSERT INTO borrowed_books (book_code, title, type_code) VALUES (#{bookCode}, #{title}, #{typeCode})")
    void insertBook(Book book);

    @Select("SELECT * FROM borrowed_books WHERE type_code = #{typeCode}")
    List<Book> selectBooksByType(String typeCode);

    @Select("SELECT * FROM borrowed_books")
    List<Book> selectAllBooks();
}
