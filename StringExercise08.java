package com.hspedu.string_;

public class StringExercise08 {
    public static void main(String[] args) {
        String a = "hello";//指向常量池
        String b = "abc";//指向常量池
        String c = a+b;//创建c对象
        //一共三个对象。

        //分析  String c = a+b
        //1、底层：创建一个 StringBuilder sb = StringBuilder()
        //2、执行 sb.append（"hello");
        //3、sb.appebd("abc");
        //sb是在堆中，并且append是在原来字符串的基础上追加的。
        //规则：String c1 = "ab"+"cd"；=》常量想加，看的是池
        //String c1 = a+b；=》变量想加，是在堆中的
        //4、String c = sb.toString();//这时一个new方法
        //最后是让c指向堆中的对象（String）value[]-》池中"helloabc "
        String d = "helloabc";
        System.out.println(c==d);//F
        String e = "hello"+"abc";
        System.out.println(e==d);//T
    }
}
