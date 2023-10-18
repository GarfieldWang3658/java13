package com.hspedu.date_;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Date01 {
    public static void main(String[] args)throws ParseException {
        //1、获取当前系统时间
        //2、这里的date类是在java.until包
        //3、默认输出的日期格式是国外的方式
        //因此通常需要对格式进行转换。

        //1、创建SimpDateFormat对象，可以指定相应的格式
        //2、格式使用的字符是规定好的，不能乱写。
        //

        Date d1 = new Date();
        System.out.println(d1);
        Date d2 = new Date(923456);
        System.out.println(d2);
        //1、可以把String转成对应的Date
        //2、得到Date 仍然在输出时，还是按照国外的形式。
        //如果希望指定的格式输出，需要转换。


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss E");
        String format = sdf.format(d1);//将日期转换成指定的格式的字符串。
        System.out.println(format);

        String s ="1996年1月1日 1:20:30 星期一";
        Date parse = sdf.parse(s);
        System.out.println(parse);



    }
}
