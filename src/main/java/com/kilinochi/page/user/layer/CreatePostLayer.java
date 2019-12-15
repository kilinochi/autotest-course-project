package com.kilinochi.page.user.layer;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.kilinochi.page.Layer;
import com.kilinochi.page.user.UserPage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public final class CreatePostLayer implements Layer {

    private static final By CREATE_POST_LOCATOR = By.xpath("//*[@id ='hook_Block_MediaTopicLayerBody']");
    private static final By PLACEHOLDER_LOCATOR = By.xpath("//*[@class ='posting_itx emoji-tx h-mod js-ok-e js-posting-itx ok-posting-handler']");
    private static final By SUBMIT_BUTTON_LOCATOR = By.xpath("//*[@data-action ='submit']");

    private final SelenideElement placeholder;
    private final SelenideElement musicElement;
    private final SelenideElement submitButton;
    private final UserPage context;

    public CreatePostLayer(UserPage context) {
        this.context = context;
        final SelenideElement rootElement = $(CREATE_POST_LOCATOR);
        placeholder = $(PLACEHOLDER_LOCATOR);
        submitButton = $(SUBMIT_BUTTON_LOCATOR);
        musicElement = rootElement.find(By.xpath("//*[@data-module ='postingForm/mediaMusicAddButton']")).shouldHave(Condition.text("Добавить музыку"));
    }

    public CreatePostLayer inputText(final String text) {
        placeholder.shouldBe(Condition.visible).setValue(text);
        return this;
    }

    public MusicLayer postMusic() {
        musicElement.shouldBe(Condition.visible).click();
        return new MusicLayer(this);
    }

    public UserPage createPost() {
        submitButton.click();
        return context;
    }
}
