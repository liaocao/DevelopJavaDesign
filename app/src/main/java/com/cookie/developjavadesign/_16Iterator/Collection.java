package com.cookie.developjavadesign._16Iterator;

//需要遍历的对象
public interface Collection {
    public com.cookie.developjavadesign._16Iterator.Iterator iterator();

    /*取得集合元素*/
    public Object get(int i);

    /*取得集合大小*/
    public int size();
}