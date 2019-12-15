package com.kilinochi.page.games;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.Condition;
import com.kilinochi.page.Page;
import com.kilinochi.page.factory.PageFactory;
import com.kilinochi.page.factory.Pages;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public final class GamePage implements Page {
    private static final By FULLSCREEN_BUTTON_SELECTOR = By.xpath("//*[@id='full-screen-button']");


    public Page fullScreen()  {
        $(FULLSCREEN_BUTTON_SELECTOR)
                .waitUntil(Condition.visible, 4000).click();
        return this;
    }

    @Override
    public Page check() {
        return this;
    }

}
