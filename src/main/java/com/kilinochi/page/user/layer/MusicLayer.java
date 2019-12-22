package com.kilinochi.page.user.layer;

import com.codeborne.selenide.SelenideElement;
import com.kilinochi.BaseElement;
import com.kilinochi.page.user.CreatePostPage;
import org.openqa.selenium.By;

import java.util.List;
import java.util.stream.Collectors;

public final class MusicLayer extends BaseElement {

    private static final By MUSIC_TRACK_LOCATOR = By.xpath("//*[@class ='track-two-lines_hld']");
    private static final By PLACEHOLDER_LOCATOR = By.xpath("//*[@class ='search-input_it it']");
    private static final By SUBMIT_BUTTON_LOCATOR = By.xpath(".//*[@class ='modal-new_actions __center']/div[1]/a[1]");

    private List<SelenideElement> musicTracks;

    public MusicLayer findMusic(final String musicName) {
        inputOnPosFromListElements(0, PLACEHOLDER_LOCATOR, musicName);
        musicTracks = searchElementsListNotEmpty(MUSIC_TRACK_LOCATOR);
        return this;
    }

    public MusicLayer withLimit(int count) {
        musicTracks = musicTracks.stream().limit(count).collect(Collectors.toList());
        return this;
    }

    public MusicLayer attachMusic() {
        musicTracks.forEach(SelenideElement::click);
        return this;
    }

    public CreatePostPage addMusic() {
        click(SUBMIT_BUTTON_LOCATOR);
        return new CreatePostPage();
    }
}
