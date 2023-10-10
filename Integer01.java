package com.hspedu.Warpper;

public class Integer01 {
    public static void main(String[] args) {
        //手动装箱
        int n1 = 100;
        Integer integer = new Integer(n1);//手动装箱-1
        Integer integer1 = Integer.valueOf(n1);//手动装箱-2

        //手动拆箱
        //Integer->int
        int i = integer.intValue();

        //jdk5后，可以自动装箱和自动拆箱
        int n2 = 200;
        //自动装箱 int -》Integer
        Integer integer2 = n2;//底层使用的仍然是Integer.valueOf()
        //自动拆箱 Integer-》int
        int n3 = integer2;//底层仍然使用的是 intValue()方法

    }
}
