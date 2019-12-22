package com.kilinochi.page.music.tab;

import com.codeborne.selenide.Condition;;
import com.kilinochi.page.music.PlaylistPage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;

public final class MyMusicTab {

    private static final By CREATE_PLAYLIST_LOCATOR = By.xpath("//*[@data-l ='t,create-playlist']");

    public PlaylistPage playlistPage() {
        $$(CREATE_PLAYLIST_LOCATOR).get(0).shouldHave(Condition.text("Создать сборник")).click();
        return new PlaylistPage();
    }
}
