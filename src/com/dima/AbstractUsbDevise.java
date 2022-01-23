package com.dima;

public abstract class AbstractUsbDevise implements UsbDevise{
    private String model;
    private String typeOfDevise;

    public AbstractUsbDevise(String model, String typeOfDevise){
        this.model = model;
        this.typeOfDevise = typeOfDevise;
    }

    @Override
    public void connect() {
        System.out.println(getTypeOfDevise() + " модели " + getModel() + " подключена.");
    }

    @Override
    public void disconnect() {
        System.out.println(getTypeOfDevise() + " модели " + getModel() + " отключена.");
    }

    public String getModel() {
        return model;
    }

    public String getTypeOfDevise(){
        return typeOfDevise;
    }
}
