package com.hty.web02;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.hty.web02.pojo.Book;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class json02 {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();

        Book book1 = new Book();
        book1.setId(1);
        book1.setName("西游记");
        book1.setAuthor("吴承恩");
        book1.setDate(new Date(System.currentTimeMillis()));

        Book book2 = new Book();
        book2.setId(2);
        book2.setName("三国演义");
        book2.setAuthor("罗贯中");
        book2.setDate(new Date(System.currentTimeMillis()));

        bookList.add(book1);
        bookList.add(book2);

        String s = JSON.toJSONStringWithDateFormat(bookList, "yyyy-MM-dd HH:mm:ss");
        System.out.println(s);
    }
}
