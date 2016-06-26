package com.neworin.test;

import com.neworin.entity.Book;
import com.neworin.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * Created by NewOrin Zhang on 2016/6/25.
 * Email: NewOrinZhang@Gmail.com
 */
public class HibernateTest {
    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Book book = new Book();
//        book.setBname("水浒传");
//        ctx.getBean("bookService", BookService.class).addBook(book);
        BookService bookService = ctx.getBean("bookService", BookService.class);
        List<Book> books = bookService.queryAllBooks();
        for (Book b : books) {
            System.out.println("查询图书:" + b.toString());
        }
        bookService.deleteBookById(3);
        Book b = new Book();
        b.setBid(2);
        b.setBname("安卓群英传");
        bookService.updateBookById(b);
    }
}
