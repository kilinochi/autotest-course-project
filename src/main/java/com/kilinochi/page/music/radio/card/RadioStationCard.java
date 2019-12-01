package com.kilinochi.page.music.radio.card;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public final class RadioStationCard {

    private static final By PLAY_MUSIC_LOCATOR = By.xpath("//*[@icon ='play']");

    private final SelenideElement selenideElement;

    public RadioStationCard(SelenideElement selenideElement) {
        this.selenideElement = selenideElement;
    }

    public RadioStationCard playRadio() {
        selenideElement.find(PLAY_MUSIC_LOCATOR).waitUntil(Condition.visible, 8000).click();
        return this;
    }
}
