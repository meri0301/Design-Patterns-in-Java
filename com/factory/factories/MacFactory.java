package com.factory.factories;

import com.factory.products.abstracts.Button;
import com.factory.products.abstracts.Checkbox;
import com.factory.products.concrete.MacButton;
import com.factory.products.concrete.MacCheckbox;

public class MacFactory implements GUIFactory{
    @Override
    public Button createButton() {
        return new MacButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}
