package com.hty.web02;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.hty.web02.pojo.Book;

import java.util.Date;

//将Book对象转化为json字符串
public class json01 {
    public static void main(String[] args) {
        Book book = new Book();
        book.setId(1);
        book.setName("西游记");
        book.setAuthor("吴承恩");
        book.setDate(new Date(System.currentTimeMillis()));

        //不换行的格式显示
        String s = JSON.toJSONStringWithDateFormat(book,"yyyy-MM-dd HH:mm:ss", SerializerFeature.BrowserCompatible);
        //换行的格式显示
        String s1 = JSON.toJSONStringWithDateFormat(book,"yyyy-MM-dd HH:mm:ss", SerializerFeature.PrettyFormat);
        System.out.println(s);
        Book book1 = JSON.parseObject(s, Book.class);
        System.out.println(book1);
    }
}
