package com.kilinochi.page.user.layer;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.kilinochi.page.Layer;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public final class CreatePostLayer implements Layer {
    private static final By CREATE_POST_LOCATOR = By.xpath("//*[@id ='hook_Block_MediaTopicLayerBody']");

    private final SelenideElement placeholder;
    private final SelenideElement musicElement;

    public CreatePostLayer() {
        final SelenideElement rootElement = $(CREATE_POST_LOCATOR);
        placeholder = rootElement.find(".input_placeholder").shouldHave(Condition.text("Напишите заметку"));
        musicElement = rootElement.find(By.xpath("//*[@data-module ='postingForm/mediaMusicAddButton']")).shouldHave(Condition.text("Добавить музыку"));
    }

    public CreatePostLayer inputText(final String text) {
        placeholder.setValue(text);
        return this;
    }


}
