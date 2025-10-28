package com.factory.client;

import com.factory.factories.GUIFactory;
import com.factory.products.abstracts.Button;
import com.factory.products.abstracts.Checkbox;

public class Application {
    private final Button button;
    private final Checkbox checkbox;

    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
