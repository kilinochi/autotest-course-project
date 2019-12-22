package com.kilinochi.page.games;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.SelenideElement;
import com.kilinochi.page.BasePage;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.sleep;
import static org.junit.Assert.assertEquals;

public class GamesCasualPage extends BasePage {

    private static final By GAMES_SELECTOR = By.xpath("//*[@class='ugrid_i']");
    private static final By GAME_OK = By.xpath("//*[@class='tico_img ic ic_group']");

    public GamesCasualPage(){
        super();
    }

    public Collection<GameCard> getCards() {
        sleep(1000);
        return  $$(GAMES_SELECTOR).shouldBe(CollectionCondition.sizeNotEqual(0)).stream()
                .map(GameCard::new).collect(Collectors.toCollection(ArrayList::new));
    }

    @Override
    protected void check() {
        SelenideElement gameOk = explicitWaitVisible(GAME_OK);
        assertEquals("Пригласить друзей", gameOk.getText());
    }
}
