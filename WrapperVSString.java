package com.hspedu.Warpper;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class WrapperVSString {
    public static void main(String[] args) {

        //包装类型---->String类型
        Integer i = 10;
        //方式1：
        String s1 = i.toString();
        //方式2：
        String s2 = String.valueOf(i);
        //方式3：
        String s3 = i + "";//得到了以Integer i 为基本数值 转成的 字符串
        System.out.println(s3);

        //String ----> 包装类
        String str4 = "12345";
        //方式1：
        Integer i2 = Integer.parseInt(str4); //将string类型转换成int，同时也使用到了自动装箱
        //方式2：
        Integer i3 = new Integer(str4);
        //方式3：
        Integer j2 = Integer.valueOf(str4);

        System.out.println(str4);
    }
}
