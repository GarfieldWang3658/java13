package com.hspedu.stringbuffer_;

public class StrinAndStringBuffer {
    public static void main(String[] args) {
        //String----->StringBuffer
        String str = "hello";
        //方式1：
        StringBuffer stringBuffer = new StringBuffer(str);
        //方式2：
        StringBuffer stringBuffer1 = new StringBuffer();
        StringBuffer append = stringBuffer1.append(str);


        //StringBuffer---->String
        //方式1：
        StringBuffer stringBuffer3 = new StringBuffer();//b1[StringBuffer]
        String s = stringBuffer3.toString();
        //方式2使用构造器
        String s1 = new String(stringBuffer3);

    }
}
