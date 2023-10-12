package com.hspedu.string_;

public class StringExercise07 {
    public static void main(String[] args) {
        String a = "hello"+"abc";
        //String a = "hello"+"abc";==>编译器会优化，等价于 String a ="helloabc"；
        //编译器会判断创建的常量池对象，是否有引用指向。
        System.out.println(a);
    }
}
