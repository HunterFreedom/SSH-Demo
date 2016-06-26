package com.neworin.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * 实体类
 */
@Entity
@Table(name = "book")
public class Book implements Serializable{
    @Id
    private int bid;
    private String bname;

    public Book() {
        super();
    }

    public Book(int bid, String bname) {
        super();
        this.bid = bid;
        this.bname = bname;
    }

    public int getBid() {
        return bid;
    }

    public void setBid(int bid) {
        this.bid = bid;
    }

    public String getBname() {
        return bname;
    }

    public void setBname(String bname) {
        this.bname = bname;
    }

    @Override
    public String toString() {
        return "Book [bid=" + bid + ", bname=" + bname + "]";
    }

}
