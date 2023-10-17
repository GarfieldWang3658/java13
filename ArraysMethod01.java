package com.hspedu.arrys_;

import java.util.Arrays;
import java.util.Comparator;

public class ArraysMethod01 {
    public static void main(String[] args) {

        Integer[] integers ={1,20,90};
        //遍历数组
//        for (int i = 0; i < integers.length; i++) {
//
//        }
        //直接使用Arrays.toString方法，显示数组
        System.out.println(Arrays.toString(integers));


        //演示sort方法的使用

        Integer arr[]={1,-1,7,0,89};
        //进行排序
        //1、可以直接使用冒泡排序，也可以使用Arrays提供的sort方法排序
        //2、因为数组是引用类型，所以通过sort排序后，会直接影响到实参arr
        //3、sort重载，也可通过传入一个接口 Compartor 实现定制排序
        //4、调用sort方法时，定制排序时，传入两个参数（1）参数数组arr，
        //（2）实现了Compartor接口的匿名内部类
        //5、底层原理:体现了接口编程的方式，
        //原码分析：
        //（1）Arrays.sort(arr, new Comparator()
        //（2）最终到  TimSort类   private static <T> void binarySort(T[] a, int lo, int hi, int start,
        //                                       Comparator<? super T> c)
        //（3）执行到 binarySort 方法的代码：
        // 会根据动态绑定机制 c.compare()执行我们传入的匿名内部类的compare()
        /*
                           while (left < right) {
                        int mid = (left + right) >>> 1;
                        if (c.compare(pivot, a[mid]) < 0)
                            right = mid;
                        else
                            left = mid + 1;          }
                    在底层代码，会通过的匿名内部类cmpare方法，来决定排序的顺序，
        */
        //(4)new Comparator() {
        //            @Override
        //            public int compare(Object o1,Object o2) {
        //                Integer i1 =(Integer) o1;
        //                Integer i2 =(Integer) o2;
        //                return i2-i1;
        //                }}
        //(5) public int compare(Object o1,Object o2)
        //返回的值>0 or <0 会影响整个排序的结果，充分体现了接口编程+动态绑定+匿名内部类的综合使用
        // 将来的底层框架和源码使用方式，会非常常见。
        //定制排序。
        //Arrays.sort(arr);//默认排序方法
        Arrays.sort(arr, new Comparator() {
            @Override
            public int compare(Object o1,Object o2) {
                Integer i1 =(Integer) o1;
                Integer i2 =(Integer) o2;
                return i2-i1;

            }
        });
        System.out.println("===排序后===");
        System.out.println(Arrays.toString(arr));

    }
}
