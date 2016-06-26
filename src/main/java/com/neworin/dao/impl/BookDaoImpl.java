package com.neworin.dao.impl;

import com.neworin.dao.BaseDao;
import com.neworin.dao.BookDao;
import com.neworin.entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by NewOrin Zhang on 2016/6/24.
 * Email: NewOrinZhang@Gmail.com
 */
public class BookDaoImpl extends BaseDao implements BookDao {


    public void addBook(Book book) {
        getSession().save(book);
        System.out.println("添加 " + book.getBname() + " 成功!");
    }

    public List<Book> queryAllBooks() {
        List<Book> bookList;
        String hql = "FROM Book";
        bookList = (List<Book>) getSession().createQuery(hql).list();
        if (bookList == null) System.out.println("查询失败!");
        if (bookList.size() == 0) System.out.println("表中没有数据!");
        return bookList;
    }

    public void deleteBookById(int id) {
        Book book = new Book();
        book.setBid(id);
        getSession().delete(book);
        System.out.println("删除图书 " + id + " 成功!");
    }

    public void updateBookById(Book book) {
        getSession().update(book);
        System.out.println("更新图书 " + book.getBname() + " 成功!");
    }

}
