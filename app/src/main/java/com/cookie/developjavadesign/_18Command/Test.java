package com.cookie.developjavadesign._18Command;

public class Test {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command cmd = new MyCommand(receiver);
        Invoker invoker = new Invoker(cmd);
        invoker.action();
    }
}
//Invoker包含Command的实例，action里面调用Command的exe方法，  MyCommand实现Command接口，实现exe方法的内容是Receiver的action方法
//最终Invoker的实现还是Receiver的action方法