package com.kilinochi.page.music;

import com.codeborne.selenide.Condition;;
import com.kilinochi.page.BasePage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;

public final class MyMusicPage extends BasePage {

    private static final By CREATE_PLAYLIST_LOCATOR = By.xpath("//*[@data-l ='t,create-playlist']");

    public MyMusicPage() {
        super();
    }

    public PlaylistPage clickToPlaylistPage() {
        $$(CREATE_PLAYLIST_LOCATOR).get(0).shouldHave(Condition.text("Создать сборник")).click();
        return new PlaylistPage();
    }

    @Override
    protected void check() {

    }
}
