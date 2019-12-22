package com.kilinochi.page.music;

import com.codeborne.selenide.SelenideElement;
import com.kilinochi.page.BasePage;
import org.openqa.selenium.By;

import java.util.List;

public final class MusicAlbumPage extends BasePage {

    private static final By ALBUM_NAME_LOCATOR = By.xpath(".//*[@data-l ='t,text-field']");
    private static final By TRACKS_LOCATOR = By.xpath(".//*[@class ='wm-track_hld __3xfx9j']");

    private final String albumName;

    private List<SelenideElement> tracks;

    public MusicAlbumPage() {
        super();
        albumName = getAttr(ALBUM_NAME_LOCATOR, "value");
    }

    public String getAlbumName() {
        return albumName;
    }

    public List<SelenideElement> getTracks() {
        return tracks;
    }

    @Override
    protected void check() {
        tracks = searchElementsListNotEmpty(TRACKS_LOCATOR);
        explicitWaitVisible(ALBUM_NAME_LOCATOR);
    }
}
