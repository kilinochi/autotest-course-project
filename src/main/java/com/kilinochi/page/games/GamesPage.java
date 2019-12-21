package com.kilinochi.page.games;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public final class GamesPage implements Page {

    private static final By CASUAL_SELECTOR = By.xpath("//*[@hrefattrs=\"st.cmd=appsShowcaseHD&st.catalog=casual\"]");

    public GamesPage(){
    }

    public GamesCasualPage toCasualPage() {
        $(CASUAL_SELECTOR).click();
        return new GamesCasualPage();
    }

    @Override
    public Page check() {
        $(CASUAL_SELECTOR).shouldBe(Condition.visible);
        return this;
    }

}
