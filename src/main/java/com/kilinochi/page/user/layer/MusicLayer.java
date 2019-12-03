package com.kilinochi.page.user.layer;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.kilinochi.page.Layer;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public final class MusicLayer implements Layer {

    private static final By MUSIC_LAYER_LOCATOR = By.xpath("//*[@class ='modal-new_cnt js-sticky-cont']");
    private static final By MUSIC_TRACK_LOCATOR = By.xpath("//*[@data-action ='track']");

    private final SelenideElement input;
    private final SelenideElement buttonSubmit;

    public MusicLayer() {
        final SelenideElement root = $(MUSIC_LAYER_LOCATOR);
        input = root.find(".search-input_it it").shouldHave(Condition.text("Искать песни на сайте")); // todo - resolve two elements
        buttonSubmit = root.find(".button-pro __disabled form-actions_yes");
    }

    public MusicLayer findMusic(final String musicName) {
        input.setValue(musicName);
        $$(MUSIC_TRACK_LOCATOR).stream().limit(2).forEach(SelenideElement::click);
        buttonSubmit.click();
        return this;
    }
}
