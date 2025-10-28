package com.factory.factories;

import com.factory.products.abstracts.Button;
import com.factory.products.abstracts.Checkbox;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
