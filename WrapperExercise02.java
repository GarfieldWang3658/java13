package com.hspedu.Warpper;

public class WrapperExercise02 {
    public static void main(String[] args) {

    }
        public void method () {
            Integer i = new Integer(1);//对象
            Integer j = new Integer(1);//对象
            System.out.println(i == j);//F
            //判断是否同一个对象

            Integer m = 1;//底层 integer.valueOf(1);->要阅读源码
            Integer n = 1;//底层 integer.valueOf(1);
            //在Integer的范围内 -128～127
            System.out.println(m == n);//T

            Integer x = 128;//超过Integer的范围，因此要new Integer
            Integer y = 128;//超过Integer的范围，因此要new Integer
            System.out.println(x == y);//F
        }
    }
