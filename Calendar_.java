package com.hspedu.date_;

import java.util.Calendar;

public class Calendar_ {
    public static void main(String[] args) {
        //1、Calendar是一个抽象类，并且构造器是私有的
        //2、可以通过getInstace（）来获取实例。
        //3、提供了大量的方法和字段提供给程序员使用。
        //4、Calendar没有提供对应饿格式化类，因此需要程序员自己组合来输出（灵活）
        //5、如果我们需要按照24小时进制来获取时间，Calendar.HOUR==>改成==>Calendar.HOUR_OF_DAY
        Calendar c = Calendar.getInstance();
        //创建日历对象，比较简单，自由
        System.out.println("c="+c);
        //2、获取日历对象的某个日历字段
        System.out.println("年="+c.get(Calendar.YEAR));
        //Calendar 返回月的时候是按照0开始编号的，所以需要+1
        System.out.println("月="+c.get(Calendar.MONTH)+1);
        System.out.println("日="+c.get(Calendar.DAY_OF_MONTH));
        System.out.println("分="+c.get(Calendar.MINUTE));
        System.out.println("秒="+c.get(Calendar.SECOND));

        System.out.println(c.get(Calendar.YEAR)+"年"+(c.get(Calendar.MONTH)+1)+"月"+
                c.get(Calendar.DAY_OF_MONTH)+"日");


    }
}
