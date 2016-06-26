package com.neworin.action;

import com.neworin.entity.Book;
import com.neworin.service.BookService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import com.opensymphony.xwork2.Preparable;
import org.apache.struts2.interceptor.RequestAware;
import org.springframework.context.ApplicationContext;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * Created by NewOrin Zhang on 2016/6/24.
 * Email: NewOrinZhang@Gmail.com
 */
public class BookAction extends ActionSupport {

    private BookService bookService;
    private int bid;
    private String bname;
    private Book mBook;
    public String getBname() {
        return bname;
    }

    public int getBid() {
        return bid;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public BookService getBookService() {
        return bookService;
    }

    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }

    /**
     * 添加图书
     *
     * @return
     */
    public String add() {
        Book book = new Book();
        book.setBname(bname);
        bookService.addBook(book);
        return SUCCESS;
    }

    /**
     * 查询图书
     *
     * @return
     */
    public String queryAllBooks() {
        bookService.queryAllBooks();
        return SUCCESS;
    }

    /**
     * 根据Id删除图书
     *
     * @return
     */
    public String deleteBookById() {
        bookService.deleteBookById(bid);
        return SUCCESS;
    }

    /**
     * 更新图书
     *
     * @return
     */
    public String updateBookById() {
        Book book = new Book();
        book.setBid(bid);
        book.setBname(bname);
        bookService.updateBookById(book);
        return SUCCESS;
    }

    /**
     * 查询所有图书
     *
     * @return
     */
    public String queryAll() {
        List<Book> list = bookService.queryAllBooks();
        if (null != list) {
            ActionContext ctx = ActionContext.getContext();
            ctx.put("list", list);
        }
        return SUCCESS;
    }

}
