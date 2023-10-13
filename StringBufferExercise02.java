package com.hspedu.stringbuffer_;

import java.util.Scanner;

public class StringBufferExercise02 {
    public static void main(String[] args) {
        System.out.println("===输入商品价格===");
        Scanner scanner = new Scanner(System.in);
        String price = scanner.next();
        StringBuffer stringBuffer = new StringBuffer(price);
        //实现一个金额数字
        //找到小数点的索引，然后在该位置的前三位插入即可。
        //int i = stringBuffer.lastIndexOf(".");
        for (int i = stringBuffer.lastIndexOf(".")-3; i > 0; i-=3){
            stringBuffer = stringBuffer.insert(i,",");
        }

        System.out.println(stringBuffer);


    }
}
