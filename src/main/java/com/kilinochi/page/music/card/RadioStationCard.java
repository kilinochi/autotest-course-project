package com.kilinochi.page.music.card;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class RadioStationCard {

    private static final Logger log = LoggerFactory.getLogger(RadioStationCard.class);
    private static final Pattern PLAYING_MUSIC_PATTER = Pattern.compile("__ekai4w playing");
    private static final By PLAY_MUSIC_LOCATOR = By.cssSelector(".__ekai4w");

    private SelenideElement root;

    public RadioStationCard(SelenideElement root) {
        this.root = root;
    }

    public RadioStationCard withName(final String name) {
        root.shouldHave(Condition.text(name));
        return this;
    }

    public void playRadio() {
        root.find(PLAY_MUSIC_LOCATOR).waitUntil(Condition.visible, 8000).click();
        refresh();
    }

    private void refresh() {
        this.root = root.waitUntil(Condition.exist, 8000);
        log.info("root = {}", root);
    }

    public boolean isMusicPlay() {
        final String getCSSClass = root.getAttribute("class");
        final Matcher matcher = PLAYING_MUSIC_PATTER.matcher(getCSSClass);
        return matcher.find();
    }
}
