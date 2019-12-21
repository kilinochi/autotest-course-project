package com.kilinochi.page;

import com.kilinochi.BaseElement;

public abstract class BasePage extends BaseElement {
    protected BasePage() {
        check();
    }

    protected abstract void check();
}
