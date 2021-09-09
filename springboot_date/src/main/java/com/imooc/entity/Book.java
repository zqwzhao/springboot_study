package com.imooc.entity;

import java.util.Date;

/**
 * @author : [zqwzh]
 * @version : [v1.0]
 * @createTime : [2021-09-08 17:37]
 */
public class Book {
    private String bookId;
    private String bookName;
    private String author;
    private Integer typeId;
    private Double price;
    private String ISBN;
    private String publishing;
    private Date publishTime;
    private String introduce;
    private Character status;

    public Book() {
    }

    public Book(String bookId, String bookName, String author, Integer typeId, Double price, String ISBN, String publishing, Date publishTime, String introduce, Character status) {
        this.bookId = bookId;
        this.bookName = bookName;
        this.author = author;
        this.typeId = typeId;
        this.price = price;
        this.ISBN = ISBN;
        this.publishing = publishing;
        this.publishTime = publishTime;
        this.introduce = introduce;
        this.status = status;
    }

    public String getBookId() {
        return bookId;
    }

    public void setBookId(String bookId) {
        this.bookId = bookId;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getPublishing() {
        return publishing;
    }

    public void setPublishing(String publishing) {
        this.publishing = publishing;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId='" + bookId + '\'' +
                ", bookName='" + bookName + '\'' +
                ", author='" + author + '\'' +
                ", typeId=" + typeId +
                ", price=" + price +
                ", ISBN='" + ISBN + '\'' +
                ", publishing='" + publishing + '\'' +
                ", publishTime=" + publishTime +
                ", introduce='" + introduce + '\'' +
                ", status=" + status +
                '}';
    }
}
