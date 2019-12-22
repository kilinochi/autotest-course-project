package com.kilinochi.page.music;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.kilinochi.page.BasePage;
import com.kilinochi.page.user.UserPage;
import org.openqa.selenium.By;

import java.util.stream.Collectors;

import static org.junit.Assert.assertEquals;

public final class PlaylistPage extends BasePage {

    private static final By INPUT_NAME_PLACEHOLDER_SELECTOR = By.xpath("//*[@class ='input __-wpm3sp']");
    private static final By SEARCH_MUSIC_PLACEHOLDER_SELECTOR = By.xpath("//*[@class ='base-input __ctxujp']");
    private static final By TRACKS_LOCATOR = By.xpath("//*[@class ='wm-track_hld __3xfx9j']");
    private static final By CREATE_ALBUM_BUTTON_SELECTOR = By.xpath("//*[@data-l ='t,submit']");

    public PlaylistPage() {
        super();
    }

    public PlaylistPage inputAlbumName(final String name) {
        sendText(INPUT_NAME_PLACEHOLDER_SELECTOR, name);
        return this;
    }

    public MusicAlbumPage addMusicFromSearch(final String musicName, final int countMusics) {
        searchElementsListNotEmpty(SEARCH_MUSIC_PLACEHOLDER_SELECTOR).get(1).setValue(musicName);
        searchElementsListNotEmpty(TRACKS_LOCATOR)
                .stream()
                .limit(countMusics)
                .forEach(selenideElement -> selenideElement.waitUntil(Condition.visible, 1000).scrollTo().click());
        click(CREATE_ALBUM_BUTTON_SELECTOR);
        return new MusicAlbumPage();
    }

    @Override
    protected void check() {
        matchText(CREATE_ALBUM_BUTTON_SELECTOR, "Создать");
        explicitWaitVisible(CREATE_ALBUM_BUTTON_SELECTOR);
        assertEquals("Название сборника", getAttr(INPUT_NAME_PLACEHOLDER_SELECTOR, "placeholder"));
        assertEquals("Поиск", getAttr(SEARCH_MUSIC_PLACEHOLDER_SELECTOR, "placeholder"));
    }
}
