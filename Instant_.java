package com.hspedu.date_;

import java.time.Instant;
import java.util.Date;

public class Instant_ {
    public static void main(String[] args) {
        //3、Instant时间戳
        //类似于Date
        //提供了一系列和Date类转换的方式
        //Instant ---> Date：
//        Date date = Date.from(instant);
        //Date ---> Instant：
//        Istant instant = date.toInstant();

        //1、通过静态方法now() 获取表示当前时间戳
        Instant now = Instant.now();
        System.out.println(now);
        //2、通过 from 可以Instant转成Date
        Date date = Date.from(now);
        //3、通过date 的 toInstant()可以把date 转成 Instant对象
        Instant instant = date.toInstant();
    }
}
