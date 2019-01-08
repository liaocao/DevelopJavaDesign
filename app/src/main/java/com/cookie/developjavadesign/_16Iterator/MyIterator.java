package com.cookie.developjavadesign._16Iterator;

public class MyIterator implements Iterator {

    private Collection collection;
    private int pos = -1;

    public MyIterator(Collection collection){
        this.collection = collection;
    }

    @Override
    public Object previous() {
        if(pos > 0){
            pos--;
        }
        return collection.get(pos);//这里pos为-1的时候，会报错吧，所以这个方法并不完美
    }

    @Override
    public Object next() {
        if(pos < collection.size()-1){//当pos小于最大长度时
            pos++;
        }
        return collection.get(pos);
    }

    @Override
    public boolean hasNext() {
        if(pos < collection.size()-1){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public Object first() {
        pos = 0;
        return collection.get(pos);
    }

}