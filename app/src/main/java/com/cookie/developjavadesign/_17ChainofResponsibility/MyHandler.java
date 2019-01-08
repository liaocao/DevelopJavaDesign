package com.cookie.developjavadesign._17ChainofResponsibility;

//MyHandler光是实现Handler接口也可以作为Handler的多态来使用
public class MyHandler extends AbstractHandler implements Handler {

    private String name;

    public MyHandler(String name) {
        this.name = name;
    }

    @Override
    public void operator() {
        System.out.println(name+"deal!");
        if(getHandler()!=null){
            getHandler().operator();//这里获取到的Handler就是setHandler的Handler，直至往下获取返回null，才会停止operator
        }
    }
}