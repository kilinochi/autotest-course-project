package com.kilinochi.page.music.tab;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public final class MyMusicTab {

    private static final By CREATE_PLAYLIST_LOCATOR = By.xpath("//*[@data-l ='t,create-playlist']");

    public MyMusicTab createAlbum() {
        $(CREATE_PLAYLIST_LOCATOR).shouldHave(Condition.text("Создать сборник")).click();
        return this;
    }
}
