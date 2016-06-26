package com.neworin.service.impl;

import com.neworin.dao.BookDao;
import com.neworin.entity.Book;
import com.neworin.service.BookService;

import java.util.List;

/**
 * Created by NewOrin Zhang on 2016/6/24.
 * Email: NewOrinZhang@Gmail.com
 */
public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    public void setBookDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public BookDao getBookDao() {
        return bookDao;
    }

    public void addBook(Book book) {
        bookDao.addBook(book);
    }

    public List<Book> queryAllBooks() {
        return bookDao.queryAllBooks();
    }

    public void deleteBookById(int id) {
        bookDao.deleteBookById(id);
    }

    public void updateBookById(Book b) {
        bookDao.updateBookById(b);
    }
}
