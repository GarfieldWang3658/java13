package com.hspedu.system_;

import java.util.Arrays;

public class System_ {
    public static void main(String[] args) {
        System.out.println("OK1");
        //1、exit（0）表示程序退出
        //2、0表示一个状态，正常的状态。
        //System.exit(0);

        System.out.println("OK2");

        //arrays copy 复制数组元素，比较适合底层调用，
        //一般使用 Arrays.copyOf完成数组复制。
        int[] src = {1,2,3};
        int[] dest = new int[3];//dest当前是{0,0,0}
        //五个参数的含义
//     源数组
//    【 src 】      the source array.
//     从源数组的哪个索引开始拷贝
//    【 srcPos 】   starting position in the source array.
//     目标数组，即把源数组的数据拷贝到哪个数组
//    【 dest 】   the destination array.
//     把源数组的数据拷贝到目标数组的哪个索引
//     【 destPos 】  starting position in the destination data.
//     从源数组拷贝多少个数据到目标数组
//     【 length 】 the number of array elements to be copied.

        System.arraycopy(src,0,dest,1,2);

        System.out.println("dest="+ Arrays.toString(dest));//[1,2,3]


        System.out.println(System.currentTimeMillis());


    }
}
