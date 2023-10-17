package com.hspedu.arrys_;

import java.util.Arrays;
import java.util.Comparator;

public class ArrayExercise {
    public static void main(String[] args) {
        book[] books = new book[4];
        books[0] = new book("红楼梦～", 100);
        books[1] = new book("金瓶梅～", 90);
        books[2] = new book("青年文摘20年", 5);
        books[3] = new book("java从入门到放弃～", 300);
        //(1)price从大到小
        Arrays.sort(books, new Comparator() {
            //如果是对哦book数组排序，因此o1和o2 就是book对象
            @Override
            public int compare(Object o1, Object o2) {
                book book1 = (book)o1;
                book book2 = (book)o2;
                double priceval = book2.getPrice()-book1.getPrice();
                //进行了一个转换
                //如果怕发现返回结果与输出的不一致，就修改返回的1和-1
                if (priceval>0){
                    return 1;
                }else if (priceval<0){
                    return -1;
                }else {
                    return 0;
                }
            }
        });
        System.out.println(Arrays.toString(books));

        //从小到大
        Arrays.sort(books, new Comparator() {
            //如果是对哦book数组排序，因此o1和o2 就是book对象
            @Override
            public int compare(Object o1, Object o2) {
                book book1 = (book)o1;
                book book2 = (book)o2;
                double priceval = book2.getPrice()-book1.getPrice();
                if (priceval>0){
                    return -1;
                }else if (priceval<0){
                    return 1;
                }else {
                    return 0;
                }
            }
        });
        System.out.println(Arrays.toString(books));
        //书名的长度

        Arrays.sort(books, new Comparator() {
            //如果是对哦book数组排序，因此o1和o2 就是book对象
            @Override
            public int compare(Object o1, Object o2) {
                book book1 = (book)o1;
                book book2 = (book)o2;
                //从书名的长度，从大到小
                return book2.getName().length()-book1.getName().length();
            }
        });
        System.out.println(Arrays.toString(books));

    }
}
class book {
    private String name;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public String toString() {
        return "book{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
