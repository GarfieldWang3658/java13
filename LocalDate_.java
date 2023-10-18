package com.hspedu.date_;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LocalDate_ {
    public static void main(String[] args) {
        //1、使用now()返回当前日期时间的对象

        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        //2、使用DateTimeFormatter 对象来进行格式化
        //创建 DateTimeFormatter对象，

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy年MM月dd日HH:mm:ss");
        String format = dtf.format(now);
        System.out.println("格式化的日期="+format);


        System.out.println("年="+now.getYear());
        System.out.println("月="+now.getMonth());
        System.out.println("月="+now.getMonthValue());
        System.out.println("日="+now.getDayOfMonth());
        now.getYear();
        now.getMonth();
        now.getDayOfMonth();
        now.getHour();
        now.getMinute();
        now.getSecond();
        LocalDate now1 = LocalDate.now();
        LocalTime now2 = LocalTime.now();

        //提供plus和minus方法，可以对当前的时间进行加或者减
        LocalDateTime localDateTime = now.plusDays(890);
        System.out.println("890天后="+dtf.format(localDateTime));

        LocalDateTime localDateTime1 = now.minusMinutes(3456);
        System.out.println("减3456分钟后="+localDateTime1);


    }
}
