package com.hspedu.homework;

public class HomeWork01 {
    public static void main(String[] args) {
        String str = "abcdef";
        System.out.println("===交换前===");
        System.out.println(str);

        try {
            str = reverse(str, 0, 8);
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return;
        }
        System.out.println("===交换后===");
        System.out.println(str);

    }
        //思路
        //1、先把方法定义确定 public static String reverse(String str, int start,int end)
        //2、先把String 转成 char数组，因为char数组的元素是可以交换的。
        //3、画出分析示意图
        //4、

        public static String reverse (String str,int start, int end){

        //对输入的参数做一个验证
            //重要的编程技巧
            //(1)写出正确的情况
            //(2)然后取反即可
            //(3)这样写，思路清晰
            if (!(str!=null && start>=0 && end>start && end<str.length())){
                throw new RuntimeException("参数不正确");
            }


            char[] chars = str.toCharArray();
            char temp = ' ';
            for (int i = start, j = end; i < j; i++, j--) {
                temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;

            }
            //使用chars 重新构建一个char数组
            return new String(chars);

        }
    }