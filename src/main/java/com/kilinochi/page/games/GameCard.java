package com.kilinochi.page.games;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

public class GameCard {

    private SelenideElement root;
    private String gameName;

    public GameCard(SelenideElement selenideElement) {
        this.root = selenideElement;
    }

    public GamePage openGame() {
        root.waitUntil(Condition.visible, 4000).click();
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
