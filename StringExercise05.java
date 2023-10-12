package com.hspedu.string_;

public class StringExercise05 {
    public static void main(String[] args) {
        Person p1 =new Person();
        p1.name = "hspedu";
        Person p2 = new Person();
        p2.name = "hspedu";

        System.out.println(p1.name.equals(p2.name));//T，字符串相同
        System.out.println(p1.name== p2.name);//T，都指向堆中对象
        System.out.println(p1.name=="hspedu");//T , p1.name返回的是常量池的地址，"hspedu"就在常量中

        String s1 = new String("bcde");
        String s2 = new String("bcde");
        System.out.println(s1 == s2);//F,s1和s2各自指向一个堆中对象，因此s1!==s2;
    }
}
class Person{
public String name;
}
