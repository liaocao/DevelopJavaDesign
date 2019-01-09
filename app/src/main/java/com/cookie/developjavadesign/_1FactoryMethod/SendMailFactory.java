package com.cookie.developjavadesign._1FactoryMethod;

public class SendMailFactory implements Provider {

    @Override
    public Sender produce(){
        return new MailSender();
    }
}