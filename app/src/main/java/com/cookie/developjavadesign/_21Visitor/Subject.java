package com.cookie.developjavadesign._21Visitor;

public interface Subject {
    public void accept(Visitor visitor);
    public String getSubject();
}