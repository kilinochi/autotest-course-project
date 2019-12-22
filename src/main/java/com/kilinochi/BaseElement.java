package com.kilinochi;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import com.codeborne.selenide.Condition;

import java.util.List;
import java.util.NoSuchElementException;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class BaseElement {
    protected void click(final By locator) {
        explicitWaitVisible(locator).click();
    }

    protected void inputOnPosFromListElements(int pos, By locator, String txt) {
        searchElementsListNotEmpty(locator).get(0).setValue(txt);
    }

    protected SelenideElement explicitWaitVisible(final By locator) {
        return explicitWait(Condition.visible, locator);
    }

    protected SelenideElement explicitWaitPresent(final By locator) {
        return explicitWait(Condition.exist, locator);
    }

    protected SelenideElement matchText(final By locator, final String text) {
        return explicitWaitPresent(locator).shouldHave(Condition.matchText(text));
    }

    protected SelenideElement explicitWait(final Condition condition,
                                           final By locator) {
        return $(locator).waitUntil(condition, 10000);
    }

    protected SelenideElement sendText(final By locator, final String txt) {
        return $(explicitWaitPresent(locator)).setValue(txt);
    }

    protected String getAttr(By locator, String attr) {
        return explicitWaitVisible(locator).getAttribute(attr);
    }

    protected List<SelenideElement> searchElementsListNotEmpty(By locator) {
        return $$(locator).shouldHave(CollectionCondition.sizeNotEqual(0), 7000);
    }

    protected boolean isElementVisible(By locator) {
        try {
            explicitWaitVisible(locator);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
