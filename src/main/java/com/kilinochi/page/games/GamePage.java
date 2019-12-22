package com.kilinochi.page.games;

import com.kilinochi.page.BasePage;
import org.openqa.selenium.By;
import static org.junit.Assert.assertTrue;

public final class GamePage extends BasePage {
    private static final By GAME_SCREEN = By.id("appMainFullScreen");

    public GamePage() {
        super();
    }

    @Override
    protected void check() {
        assertTrue(explicitWaitVisible(GAME_SCREEN).exists());
    }
}
