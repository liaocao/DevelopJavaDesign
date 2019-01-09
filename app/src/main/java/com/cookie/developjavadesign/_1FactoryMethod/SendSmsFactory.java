package com.cookie.developjavadesign._1FactoryMethod;

public class SendSmsFactory implements Provider{

    @Override
    public Sender produce() {
        return new SmsSender();
    }
}