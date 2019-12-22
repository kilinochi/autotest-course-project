package com.kilinochi.page.games;

import com.codeborne.selenide.Condition;
import com.kilinochi.page.BasePage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public final class GamesPage extends BasePage {

    private static final By CASUAL_SELECTOR = By.xpath("//*[@hrefattrs=\"st.cmd=appsShowcaseHD&st.catalog=casual\"]");

    public GamesPage(){
    }

    public GamesCasualPage toCasualPage() {
        $(CASUAL_SELECTOR).click();
        return new GamesCasualPage();
    }

    @Override
    protected void check() {
        $(CASUAL_SELECTOR).shouldBe(Condition.visible);
    }
}
