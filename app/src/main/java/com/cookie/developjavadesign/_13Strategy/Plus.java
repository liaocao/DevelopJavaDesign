package com.cookie.developjavadesign._13Strategy;

public class Plus extends AbstractCalculator implements ICalculator {

    @Override
    public int calculate(String exp) {//重写接口里的方法并且调用抽象类里的方法
        int arrayInt[] = split(exp,"\\+");
        return arrayInt[0]+arrayInt[1];
    }
}