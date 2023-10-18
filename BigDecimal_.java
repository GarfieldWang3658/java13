package com.hspedu.bignum;

import java.math.BigDecimal;

public class BigDecimal_ {
    public static void main(String[] args) {
        //当我们需要保存一个精度很高的数时，double不够用
        //可以使用BigDecimal
//        double d = 1991.8806251217115694023938757395733447659843d;
//        System.out.println(d);
        BigDecimal bigDecimal = new BigDecimal("1991.8806251217115694023938757395733447659843");
        BigDecimal bigDecimal1 = new BigDecimal(1.1);
        System.out.println(bigDecimal);
        //如果对BigDecimal进行运算，需要使用对应的方法。
        System.out.println(bigDecimal.add(bigDecimal1));
        System.out.println(bigDecimal.subtract(bigDecimal1));
        System.out.println(bigDecimal.multiply(bigDecimal1));
        //System.out.println(bigDecimal.divide(bigDecimal1));//可能抛出异常，算数异常，
        //在调用divide 方法时，指定精度即可，BigDecimal.ROUND_CEILING
        //如果有无限循环的小数，就会保留分子的精度。
        System.out.println(bigDecimal.divide(bigDecimal1,BigDecimal.ROUND_CEILING));
    }
}
