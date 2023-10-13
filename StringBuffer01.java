package com.hspedu.stringbuffer_;

public class StringBuffer01 {
    public static void main(String[] args) {
        //1、StringBuffer 的直接父类为 AbstractStringBuilder
        //2、StringBuffer 实现了 Serialzable，即StringBuffer的对象是可以串行化的。
        //3、在父类中，AbstractStringBuilder 有属性char[] value，不是final类型
        //   该value 数组 存放字符串内容，引出存放在堆中的
        //4、StringBuffer 是一个final类，不能被继承。
        //5、因为StringBuffer 字符内容是存在char[]value，所有在变化（增加/删除）
        //   不用每次都更换地址（即不是每次都创建新对象），所以效率高于String

        StringBuffer stringBuffer = new StringBuffer();
    }
}
