package com.kilinochi.page.games;

import com.kilinochi.page.Page;
import org.openqa.selenium.By;

public final class GamePage implements Page {
    private static final By FULLSCREEN_BUTTON_SELECTOR = By.xpath("//*[@id='full-screen-button']");
    

    @Override
    public Page check() {
        return this;
    }

}
