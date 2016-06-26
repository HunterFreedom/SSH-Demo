package com.neworin.service;

import com.neworin.entity.Book;

import java.util.List;

/**
 * Created by NewOrin Zhang on 2016/6/24.
 * Email: NewOrinZhang@Gmail.com
 */
public interface BookService {
     void addBook(Book book);
     List<Book> queryAllBooks();
     void deleteBookById(int id);
     void updateBookById(Book b);
}
