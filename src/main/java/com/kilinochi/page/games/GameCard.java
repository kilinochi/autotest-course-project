package com.kilinochi.page.games;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.StaleElementReferenceException;

public class GameCard {

    private SelenideElement root;
    private String gameName;

    public GameCard(SelenideElement selenideElement) {
        this.root = selenideElement;
    }

    public GamePage openGame() {
        SelenideElement link = root.find(".games-card_sect_a");
        link.click();
        return new GamePage();
    }

    public GameCard withName(String name) {
        root.shouldBe(Condition.text(name));
        return this;
    }

    public String getGameName() {
        return gameName;
    }
}
