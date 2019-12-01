package com.kilinochi.page.music;

import com.kilinochi.page.Page;
import com.kilinochi.page.music.radio.RadioTab;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public final class MusicPage implements Page {

    private static final By RADIO_LOCATOR = By.xpath("//*[@data-l ='t,radio']");

    public RadioTab radioTab() {
        $(RADIO_LOCATOR).click();
        return new RadioTab();
    }

    @Override
    public Page check() {
        return null;
    }
}
