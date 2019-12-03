package com.kilinochi.page.user.layer;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.kilinochi.page.Layer;
import org.openqa.selenium.By;

import java.util.List;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public final class MusicLayer implements Layer {

    private static final By MUSIC_TRACK_LOCATOR = By.xpath("//*[@class ='track-two-lines_hld']");
    private static final By PLACEHOLDER_LOCATOR = By.xpath("//*[@class ='search-input_it it']");
    private static final By SUBMIT_BUTTON_LOCATOR = By.xpath("//*[@class ='track-two-lines __enabled __idle soh-s js-track __selectable']");
    private final CreatePostLayer context;


    private final SelenideElement input;
    private final SelenideElement buttonSubmit;

    public MusicLayer(final CreatePostLayer context) {
        this.context = context;
        input = $$(PLACEHOLDER_LOCATOR).get(0);
        buttonSubmit = $(SUBMIT_BUTTON_LOCATOR);
    }

    public MusicLayer findMusic(final String musicName) {
        input.setValue(musicName);
        $$(MUSIC_TRACK_LOCATOR).shouldBe(CollectionCondition.sizeNotEqual(0), 8000)
                .stream().limit(3).forEach(SelenideElement::click);
        return this;
    }

    public CreatePostLayer createPost() {
        buttonSubmit.click();
        return context;
    }
}
