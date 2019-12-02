package com.kilinochi.page.music;

import com.kilinochi.page.Page;
import com.kilinochi.page.music.tab.MyMusicTab;
import com.kilinochi.page.music.tab.RadioTab;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public final class MusicPage implements Page {

    private static final By RADIO_LOCATOR = By.xpath("//*[@data-l ='t,radio']");
    private static final By MY_MUSIC_LIBRARY_LOCATOR = By.xpath("//*[@class ='wm-menu_link __3121tz __library']");

    public RadioTab radioTab() {
        $(RADIO_LOCATOR).click();
        return new RadioTab();
    }

    public MyMusicTab myMusicTab() {
        $(MY_MUSIC_LIBRARY_LOCATOR).click();
        return new MyMusicTab();
    }

    @Override
    public Page check() {
        return null;
    }
}
