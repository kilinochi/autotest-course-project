package com.kilinochi.page.music.tab;

import com.codeborne.selenide.Condition;
import com.kilinochi.page.factory.PageFactory;
import com.kilinochi.page.factory.Pages;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$$;

public final class MyMusicTab {

    private static final By CREATE_PLAYLIST_LOCATOR = By.xpath("//*[@data-l ='t,create-playlist']");

    public Page playlistPage() {
        $$(CREATE_PLAYLIST_LOCATOR).get(0).shouldHave(Condition.text("Создать сборник")).click();
        return PageFactory.getFactory(Pages.PlaylistPage).create();
    }
}
