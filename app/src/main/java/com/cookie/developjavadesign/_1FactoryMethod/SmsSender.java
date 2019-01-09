package com.cookie.developjavadesign._1FactoryMethod;

public class SmsSender implements Sender {

    @Override
    public void Send() {
        System.out.println("this is sms sender!");
    }
}