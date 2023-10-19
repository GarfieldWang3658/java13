package com.hspedu.homework;

import javax.swing.*;
import java.util.Locale;
import java.util.Scanner;

public class HomeWork03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    }
    //编写方法，完成输出格式要求的字符串
    //思路
    //1、对输入的字符串进行分割 split("")
    //2、对得到的String[] 进行格式化String.Format()
    //3、对数据进行校验即可
    public static void print(String str){
        if (str==null){
            System.out.println("name不能为空");
                return;
        }
        String []names = str.split(" ");
        if (names.length!=3){
            System.out.println("name 输入的字符串格式不正确（XXX XXX XXX）");
            return;
        }
        String format = String.format("%s,%s,%c", names[2], names[0], names[1].toUpperCase().charAt(0));
        {
            System.out.println(format);
        }


    }

}
