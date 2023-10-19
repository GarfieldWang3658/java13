package com.hspedu.homework;

import java.util.Scanner;

public class HomeWork02 {
    public static void main(String[] args) {
        //思路
        //1、先编写方法 userRegister（String name，String psd，String email）
        //2、针对输入的内容进行校验，如果有问题，就抛出异常
        //3、单独写一个方法，判断密码是否全部位数字字符。boolean
        Scanner scanner = new Scanner(System.in);
        System.out.println("===请输入用户名===");
        String name = scanner.next();
        System.out.println("===请输入用户秘密===");
        String pwd = scanner.next();
        System.out.println("===请输入用户邮箱===");
        String email = scanner.next();

        try {
            userRegister(name, pwd, email);
            System.out.println("===恭喜！注册成功===");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static void userRegister(String name, String pwd, String email) {
        //1、验证名字
        if (!(name!=null&&pwd!=null&&email!=null)){
            throw new RuntimeException("===参数不能为空！===");
        }

        int userLength = name.length();
        if (!(userLength >= 2 && userLength <= 4)) {
            throw new RuntimeException("===用户名长度为2～4位===");
        }

        int pwdLength = pwd.length();
        if (!(pwdLength == 6 && isDigital(pwd))) {
            throw new RuntimeException("===密码长度位6位，并且必须位数字===");
        }
        int i = email.indexOf('@');
        int j = email.indexOf('.');
        if (!(i > -1 && j > i)) {
            throw new RuntimeException("===邮箱中需要包含'@'和'.'===");
        }
    }
    public static boolean isDigital(String pwd) {
        char[] chars = pwd.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] < '0' || chars[i] > '9') {
                return false;
            }
            } return true;
    }
    }

