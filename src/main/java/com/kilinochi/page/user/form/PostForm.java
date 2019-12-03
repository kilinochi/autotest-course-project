package com.kilinochi.page.user.form;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.kilinochi.page.Layer;
import com.kilinochi.page.user.layer.CreatePostLayer;

public final class PostForm {
    private final SelenideElement rootElement;
    private final SelenideElement inputElement;

    public PostForm(SelenideElement rootElement) {
        this.rootElement = rootElement;
        inputElement = rootElement.find(".pf-head_cnt").should(Condition.text("Напишите заметку"));
    }

    public Layer postLayer() {
        inputElement.click();
        return new CreatePostLayer();
    }
}
