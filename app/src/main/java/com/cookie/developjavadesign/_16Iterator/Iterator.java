package com.cookie.developjavadesign._16Iterator;

//迭代器对象，用于对聚集对象进行遍历访问
public interface Iterator {
    //前移
    public Object previous();

    //后移
    public Object next();
    public boolean hasNext();

    //取得第一个元素
    public Object first();
}