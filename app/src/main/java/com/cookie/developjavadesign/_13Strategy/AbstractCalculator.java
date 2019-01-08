package com.cookie.developjavadesign._13Strategy;

public abstract class AbstractCalculator {

    //将字符串exp以opt拆分，返回前两个值构成的数组
    public int[] split(String exp,String opt){
        String array[] = exp.split(opt);
        int arrayInt[] = new int[2];
        arrayInt[0] = Integer.parseInt(array[0]);
        arrayInt[1] = Integer.parseInt(array[1]);
        return arrayInt;
    }
}
