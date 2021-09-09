package com.imooc.controller;

import com.imooc.dao.BookDaoImpl;
import com.imooc.demo.Song;
import com.imooc.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

/**
 * @author : [zqwzh]
 * @version : [v1.0]
 * @createTime : [2021-09-08 17:52]
 */
@RestController
public class BookController {
    @Autowired
    BookDaoImpl bookDao;


    @RequestMapping(value = "/books",method = RequestMethod.GET)
    public List<Book>  getBooks() {
        List<Book> books = bookDao.getBooks();
        sort(1,books);
        books.forEach(System.out::println);
        return books;
    }


    private void sort(int i,List<Book> bookList) {
        switch(i) {
            case 1:
                //按照book的Id号进行排序
                Collections.sort(bookList, new Comparator<Book>() {

                    @Override
                    public int compare(Book book1, Book book2) {
                        // TODO Auto-generated method stub
                        return book1.getBookId().compareTo(book2.getBookId());
                    }

                });
                break;
            case 2:
                //按照书名进行排序
                Collections.sort(bookList, new Comparator<Book>() {
                    @Override
                    public int compare(Book book1, Book book2) {
                        // TODO Auto-generated method stub
                        return book1.getBookName().compareTo(book2.getBookName());
                    }
                });
                break;
            case 3:
                //按照ISBN号进行排序
                Collections.sort(bookList, (book1,book2) -> {
                    return book1.getISBN().compareTo(book2.getISBN());
                });

                break;
            case 4:
                //按照价格进行排序
                Collections.sort(bookList, new Comparator<Book>() {
                    @Override
                    public int compare(Book book1, Book book2) {
                        // TODO Auto-generated method stub
                        return book1.getPrice().compareTo(book2.getPrice());
                    }
                });
                break;

        }
    }
}
