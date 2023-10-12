package com.hspedu.string_;

public class StringExercise03 {
    public static void main(String[] args) {
        String a = "hsp";//a指向常量吃"hsp"
        String b = new String("hsp");//b指向堆中对象
        System.out.println(a.equals(b));//T
        System.out.println(a==b);//F，a指向常量池，b指向堆中对象，比较的是地址，a和b的地址不相同。
        System.out.println(a==b.intern());//T
        System.out.println(b==b.intern());//F，b指向堆，b.intern指向常量池
        //intern表示规范表示=》返回池中的字符串地址，否则。
    }
}
