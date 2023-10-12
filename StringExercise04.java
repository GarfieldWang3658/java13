package com.hspedu.string_;

public class StringExercise04 {
    public static void main(String[] args) {
        String s1 = "hspedu";
        String s2 = "java";
        String s4 = "java";
        String s3 = new String("java");
        System.out.println(s2 == s3);//F s2指向常量池，s3 指向堆中的对象
        System.out.println(s2 == s4);//T
        System.out.println(s2.equals(s3));//T，比较的字符串内容是否相同
        System.out.println(s1 == s2);//F，常量池数据空间不同
    }
}
