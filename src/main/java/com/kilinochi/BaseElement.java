package com.kilinochi;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import com.codeborne.selenide.Condition;

import static com.codeborne.selenide.Selenide.$;

public class BaseElement {
    protected void click(final By locator) {
        explicitWaitVisible(locator).click();
    }

    protected SelenideElement explicitWaitVisible(final By locator) {
        return explicitWait(Condition.visible, locator);
    }

    protected SelenideElement explicitWaitPresent(final By locator) {
        return explicitWait(Condition.exist, locator);
    }

    protected SelenideElement matchText(final SelenideElement element, final String text) {
        return element.shouldHave(Condition.matchesText(text));
    }

    protected SelenideElement explicitWait(final Condition condition,
                                           final By locator) {
        return $(locator).waitUntil(condition, 10000);
    }
}
