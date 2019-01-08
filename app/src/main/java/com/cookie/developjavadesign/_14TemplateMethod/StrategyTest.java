package com.cookie.developjavadesign._14TemplateMethod;

public class StrategyTest {
    public static void main(String[] args) {
        String exp = "8+8";
        AbstractCalculator cal = new Plus();
        int result = cal.calculate(exp, "\\+");
        System.out.println(result);
    }
}
//解释一下模板方法模式，就是指：一个抽象类中，有一个主方法，再定义1...n个方法，可以是抽象的，
//也可以是实际的方法，定义一个类，继承该抽象类，重写抽象方法，通过调用抽象类，实现对子类的调用
//与策略模式的区别就是策略模式是定义了一个接口类，继承抽象类的子类是实现了接口类的方法从而实现不同的结果