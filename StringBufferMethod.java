package com.hspedu.stringbuffer_;

public class StringBufferMethod {
    public static void main(String[] args) {
        //增
        StringBuffer s = new StringBuffer("hello");
        s.append(',');
        s.append("wang");
        s.append("shen").append(100).append(true).append(10.5);
        System.out.println(s);

        //删
        //删除[11-14)
        //字符，不包括14
        s.delete(11,14);
        System.out.println(s);

        //修改==》替换
        //替换9-11的字符[9-11)，不包括11
        s.replace(9,11,"123");
        System.out.println(s);

        //查
        //查找指定的字符串第一次出现的索引，如果找不到返回-1
        int indexOf = s.indexOf("xxx");
        System.out.println(indexOf);

        //插
        //在索引为9的位置，插入"charu"，原来索引为9的内容自动后移。
        s.insert(9,"charu ");

        //长度
        System.out.println(s.length());
        System.out.println(s);



    }
}
