package com.hspedu.stringbuffer_;

public class StringBufferExercise01 {
    public static void main(String[] args) {
        String str = null;
        StringBuffer sb = new StringBuffer();
        sb.append(str);//底层调用了AbstractStringBuilder appendNull()
        System.out.println(sb.length());//4，将null转换成null字符串，

        System.out.println(sb);//null
        StringBuffer sb1 = new StringBuffer(str);//str为null，空指针异常
        //底层代码 super.(str.length()+16);
        System.out.println(sb1);//空指针

    }
}
