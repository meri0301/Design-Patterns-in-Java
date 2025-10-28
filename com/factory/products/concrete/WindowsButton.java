package com.factory.products.concrete;
import com.factory.products.abstracts.Button;

public class WindowsButton implements Button {
    @Override
    public void paint() {
        System.out.println("Rendering a button in Windows style");
    }
}
