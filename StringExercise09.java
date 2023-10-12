package com.hspedu.string_;

public class StringExercise09 {
    public static void main(String[] args) {
        String s1 = "hspedu";//指向池中"hspedu"
        String s2 = "java";//指向池中"java"
        String s5 = "hspedujava";//指向池中"hspedujava"
        String s6 = (s1+s2).intern();//指向池中字符串"hspedujava"
        System.out.println(s5 == s6);//T
        System.out.println(s5.equals(s6));//T
    }
}
