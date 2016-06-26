package com.neworin.dao;

import com.neworin.entity.Book;

import java.util.List;

/**
 * Created by NewOrin Zhang on 2016/6/24.
 * Email: NewOrinZhang@Gmail.com
 */
public interface BookDao {
    /**
     * 添加图书
     *
     * @param book
     */
    void addBook(Book book);

    /**
     * 查询图书
     *
     * @return
     */
    List<Book> queryAllBooks();

    /**
     * 根据Id删除图书
     *
     * @param id
     */
    void deleteBookById(int id);

    /**
     * 根据Id修改图书
     *
     * @param id
     */
    void updateBookById(Book book);
}
