package com.hspedu.arrys_;

import java.util.Arrays;
import java.util.List;

public class ArraysMethod02 {
    public static void main(String[] args) {
        Integer[]arr={1,2,90,123,456};
        //binarySearch 通过二分搜索法进行查找，要求必须拍好
        //1、使用 binarySearch 二叉查找法
        //2、要求该数组是有序的
        //如果该数组是无序的，则不能使用 binarySearch 二叉查找法
        //3、如果数组中不存在该元素，就返回  return -(low + 1);  // key not found.
        //
        int index = Arrays.binarySearch(arr,99);
        System.out.println("index="+index);

        //copyOf 数组元素的复制
        //1、从arr数组中拷贝arr.length个元素到 newArr数组中
        //2、如果需要拷贝的数组长度 > arr.length 就在新数组的后面增加null
        //3、如果拷贝长度 < 0，就抛出异常 NegativeArraySizeException
        //4、该方法的底层使用的是 System.arraycopy()方法
        Integer[] newArr = Arrays.copyOf(arr,arr.length);
        System.out.println("===拷贝执行完毕后===");
        System.out.println(Arrays.toString(newArr));

        //fill 数组元素的填充
        //使用指定的数，去填充num数组，可以理解为替换原来的元素。
        Integer[]num = new Integer[]{9,3,2};
        Arrays.fill(num,99);
        System.out.println("===num数组填充后===");
        System.out.println(Arrays.toString(num));

        //equals 比较两个数组内容是否完全一致。
        Integer[]arr2 = {1,2,9,123,567,};
        //如果arr和arr2数组的元素一样，则返回true
        //如果不是完全一样就返回false；
        boolean equals = Arrays.equals(arr,arr2);
        System.out.println("equals="+equals);

        //asList 将一组值，转换成list
        //1、asList方法，会将（2，3，4，5，6，1）数据转成一个List集合
        //2、返回的 asList 编译类型List(接口)
        //3、asList 运行类型 java.util.Arrays$ArrayList，
        //   是Arrays类的静态内部类
        List asList = Arrays.asList(2,3,4,5,6,1);
        System.out.println("asLiset="+asList);
        System.out.println("asList的运行类型"+asList.getClass());




    }

}
