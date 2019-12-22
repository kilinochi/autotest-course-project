package com.kilinochi.page.user.layer;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.kilinochi.BaseElement;
import com.kilinochi.page.user.UserPage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public final class CreatePostLayer extends BaseElement {

    private static final By CREATE_POST_LOCATOR = By.xpath("//*[@id ='hook_Block_MediaTopicLayerBody']");
    private static final By PLACEHOLDER_LOCATOR = By.xpath("//*[@class ='posting_itx emoji-tx h-mod js-ok-e js-posting-itx ok-posting-handler']");
    private static final By SUBMIT_BUTTON_LOCATOR = By.xpath("//*[@data-action ='submit']");

    private final SelenideElement musicElement;
    public CreatePostLayer() {
        final SelenideElement rootElement = $(CREATE_POST_LOCATOR);
        musicElement = rootElement.find(By.xpath("//*[@data-module ='postingForm/mediaMusicAddButton']")).shouldHave(Condition.text("Добавить музыку"));
    }

    public CreatePostLayer inputText(final String text) {
        sendText(PLACEHOLDER_LOCATOR, text);
        return this;
    }

    public MusicLayer postMusic() {
        musicElement.shouldBe(Condition.visible).click();
        return new MusicLayer(this);
    }

    public UserPage createPost() {
        click(SUBMIT_BUTTON_LOCATOR);
        return new UserPage();
    }
}
