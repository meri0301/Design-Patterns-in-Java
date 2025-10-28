package com.factory.products.concrete;
import com.factory.products.abstracts.Checkbox;

public class MacCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Rendering a checkbox in Mac style");
    }
}
