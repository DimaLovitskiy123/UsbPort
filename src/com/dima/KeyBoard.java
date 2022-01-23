package com.dima;

public class KeyBoard extends AbstractUsbDevise {

    private final static String keyboard = "Клавиатура";

    public KeyBoard(String model) {
        super(model, keyboard);
    }

    /*@Override
    public void connect() {
        System.out.println("Клавиатура модели " + getModel() + " подключена.");
    }

    @Override
    public void disconnect() {
        System.out.println("Клавиатура модели " + getModel() + " отключена.");
    }*/
}
