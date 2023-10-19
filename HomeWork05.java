package com.hspedu.homework;

public class HomeWork05 {
    public static void main(String[] args) {
        String s1 ="hspedu";
        Animal a =new Animal(s1);
        Animal b = new Animal(s1);
        System.out.println(a==b);//F
        System.out.println(a.equals(b));//F
        //equals调用的Animal对象，因为Animal没有重写，因此
        // System.out.println(a.equals(b)) =》（a==b）判断a和b 是否为同一对象
        System.out.println(a.name==b.name);//T
        String s4 = new String("hepedu");
        String s5 = "hspedu";
        System.out.println(s1==s4);//F
        System.out.println(s4==s5);//F/
        //不是指向一个对象的 因此也是False
        String t1 = "hello"+s1;
        String t2 = "hellohspedu";
        System.out.println(t1.intern()==t2);//T
        //intern()返回的是字符串在常量池的地址。
    }
}
class Animal{
    String name;
    public Animal(String name){
        this.name=name;
    }
}
