package com.kilinochi.page.music;

import com.kilinochi.page.BasePage;
import com.kilinochi.page.music.tab.MyMusicTab;
import com.kilinochi.page.music.tab.RadioTab;
import org.openqa.selenium.By;

public final class MusicPage extends BasePage {

    private static final By RADIO_LOCATOR = By.xpath("//*[@data-l ='t,radio']");
    private static final By MY_MUSIC_LIBRARY_LOCATOR = By.xpath("//*[@class ='wm-menu_link __3121tz __library']");

    public MusicPage() {
        super();
    }

    public RadioTab radioTab() {
        click(RADIO_LOCATOR);
        return new RadioTab();
    }

    public MyMusicTab myMusicTab() {
        click(MY_MUSIC_LIBRARY_LOCATOR);
        return new MyMusicTab();
    }

    @Override
    protected void check() {
        explicitWaitVisible(RADIO_LOCATOR);
        explicitWaitVisible(MY_MUSIC_LIBRARY_LOCATOR);
        matchText(MY_MUSIC_LIBRARY_LOCATOR, "Моя музыка");
    }
}
