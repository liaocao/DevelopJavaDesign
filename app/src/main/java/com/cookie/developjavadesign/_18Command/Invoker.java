package com.cookie.developjavadesign._18Command;

//持有接口Command，Command包含未被实现的方法exe，在这里直接放在action方法里面
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void action(){
        command.exe();
    }
}