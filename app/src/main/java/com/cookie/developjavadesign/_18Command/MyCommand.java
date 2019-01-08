package com.cookie.developjavadesign._18Command;

//Receiver就是包含一个已实现的action方法
public class MyCommand implements Command {

    private Receiver receiver;

    public MyCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void exe() {
        receiver.action();
    }
}