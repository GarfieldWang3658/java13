package com.hspedu.homework;

import java.util.Scanner;

public class HomeWork04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("===请输入字符===");
        String str = scanner.next();
        countStr(str);


    }
    //思路分析
    //1、字节遍历字符串，如果字符在0～9范围内是数字，
    //2、如果char在a-z之间，就是小写字母
    //3、如果char在A-Z之间，就是大写字母
    //4、使用3个变量来统计结果
    public static void countStr(String str){
        if (str == null){
            System.out.println("===String不能为空===");
            return;
        }
        int strLength = str.length();
        int numCount = 0;
        int lowerCount = 0;
        int upperCount = 0;
        int otherCount = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)>='0'&&str.charAt(i)<='9'){
                numCount++;
            }else if (str.charAt(i)>='a'&&str.charAt(i)<='z'){
                lowerCount++;
            }else if (str.charAt(i)>='A'&&str.charAt(i)<='Z'){
                upperCount++;
            }else {
                otherCount++;
            }

        }
        System.out.println("数字有"+numCount+"个");
        System.out.println("小写字母有"+lowerCount+"个");
        System.out.println("大写字母有"+upperCount+"个");
        System.out.println("其他字符有"+otherCount+"个");

    }


}
