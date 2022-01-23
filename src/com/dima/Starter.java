package com.dima;

import java.util.ArrayList;
import java.util.List;

public class Starter {
    public static void main(String[] args) {
        Computer computer = new Computer(getUsbDevises());

        computer.computerOn();
        System.out.println("");
        computer.computerOff();
    }

    private static List<UsbDevise> getUsbDevises(){
        List<UsbDevise> result = new ArrayList();
        result.add(new KeyBoard("15" ));
        result.add(new ComputerMouse("1"));
        return result;
    }
}
