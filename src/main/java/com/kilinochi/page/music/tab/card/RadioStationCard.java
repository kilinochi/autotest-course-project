package com.kilinochi.page.music.tab.card;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public final class RadioStationCard {
    
    private static final By PLAY_MUSIC_LOCATOR = By.cssSelector(".__ekai4w");

    private final SelenideElement root;

    public RadioStationCard(SelenideElement root) {
        this.root = root;
    }

    public RadioStationCard withName(final String name) {
        root.shouldHave(Condition.text(name));
        return this;
    }

    public RadioStationCard playRadio() {
        root.find(PLAY_MUSIC_LOCATOR).waitUntil(Condition.visible, 8000).click();
        return this;
    }
}
