package com.hspedu.bignum;

import java.math.BigInteger;

public class BigInteger_ {
    public static void main(String[] args) {

    //当编程中需要处理很大的整数，long不够用的情况
    //可以使用bigInteger的类来搞定。
//        long l = 237888888999999;
//        System.out.println("l="+l);
    BigInteger bigInteger = new BigInteger("237888888999999");
        BigInteger bigInteger1 = new BigInteger("100");
        System.out.println(bigInteger);
    //1、在对BigInteger 进行加减乘除的时候，需要使用对应的方法，不能直接进行+-*/
    //2、可以创建一个 要操作的 BingInteger 然后进行相应操作。
        //语法：
        BigInteger add = bigInteger.add(bigInteger1);
        System.out.println(add);//加
        BigInteger subtract = bigInteger.subtract(bigInteger1);
        System.out.println(subtract);//减
        BigInteger multiply = bigInteger.multiply(bigInteger1);
        System.out.println(multiply);//乘
        BigInteger divide = bigInteger.divide(bigInteger1);
        System.out.println(divide);//除

    }
}

