package com.factory.factories;

import com.factory.products.abstracts.Button;
import com.factory.products.abstracts.Checkbox;
import com.factory.products.concrete.WindowsButton;
import com.factory.products.concrete.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
