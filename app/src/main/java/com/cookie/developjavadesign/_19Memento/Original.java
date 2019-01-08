package com.cookie.developjavadesign._19Memento;

//这里将自己的value值作为Memento的元素值了，restoreMemento方法是用value接收memento的value值
public class Original {
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Original(String value) {
        this.value = value;
    }

    public Memento createMemento(){
        return new Memento(value);
    }

    public void restoreMemento(Memento memento){
        this.value = memento.getValue();
    }
}
