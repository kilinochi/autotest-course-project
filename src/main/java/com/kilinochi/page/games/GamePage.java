package com.kilinochi.page.games;

import com.kilinochi.page.BasePage;
import org.openqa.selenium.By;

public final class GamePage extends BasePage {
    private static final By FULLSCREEN_BUTTON_SELECTOR = By.xpath("//*[@id='full-screen-button']");

    public GamePage() {
        super();
    }


    @Override
    protected void check() {

    }
}
