package com.factory.products.concrete;
import com.factory.products.abstracts.Checkbox;

public class WindowsCheckbox implements Checkbox {
    @Override
    public void paint() {
        System.out.println("Rendering a checkbox in Windows style");
    }
}
