package com.kilinochi.page.music;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.kilinochi.page.Page;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public final class PlaylistPage implements Page {

    private static final By INPUT_NAME_PLACEHOLDER_SELECTOR = By.xpath("//*[@class ='input __-wpm3sp']");
    private static final By SEARCH_MUSIC_PLACEHOLDER_SELECTOR = By.xpath("//*[@class ='base-input __ctxujp']");
    private static final By TRACKS_LOCATOR = By.xpath("//*[@class ='wm-track_hld __3xfx9j']");
    private static final By CREATE_ALBUM_BUTTON_SELECTOR = By.xpath("//*[@data-l ='t,submit']");

    public PlaylistPage() {

    }

    public PlaylistPage inputAlbumName(final String name) {
        $(INPUT_NAME_PLACEHOLDER_SELECTOR).setValue(name);
        return this;
    }

    public PlaylistPage addMusicFromSearch(final String musicName, final int firstNCount) {
        $$(SEARCH_MUSIC_PLACEHOLDER_SELECTOR).get(1).setValue(musicName);
        $$(TRACKS_LOCATOR).shouldHave(CollectionCondition.sizeNotEqual(0), 7000) // todo - add scroll
                .stream()
                .limit(firstNCount)
                .forEach(SelenideElement::click);
        $(CREATE_ALBUM_BUTTON_SELECTOR).shouldHave(Condition.text("Создать")).click();
        return this;
    }

    @Override
    public Page check() {
        return this;
    }
}
