package com.kilinochi.page.music;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.kilinochi.page.music.tab.MyMusicTab;
import com.kilinochi.page.music.tab.RadioTab;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public final class MusicPage implements Page {

    private static final By RADIO_LOCATOR = By.xpath("//*[@data-l ='t,radio']");
    private static final By MY_MUSIC_LIBRARY_LOCATOR = By.xpath("//*[@class ='wm-menu_link __3121tz __library']");
    private final SelenideElement radioElement;
    private final SelenideElement myMusicLibraryElement;

    public MusicPage() {
        radioElement = $(RADIO_LOCATOR);
        myMusicLibraryElement = $(MY_MUSIC_LIBRARY_LOCATOR);
        check();
    }

    public RadioTab radioTab() {
        radioElement.click();
        return new RadioTab();
    }

    public MyMusicTab myMusicTab() {
        $(MY_MUSIC_LIBRARY_LOCATOR).shouldHave(Condition.text("Моя музыка")).click();
        return new MyMusicTab();
    }

    @Override
    public Page check() {
        myMusicLibraryElement.shouldBe(Condition.visible);
        radioElement.shouldBe(Condition.visible);
        return this;
    }
}
