package com.kilinochi.page.games;

import com.codeborne.selenide.CollectionCondition;
import com.kilinochi.page.BasePage;
import com.kilinochi.page.ContainsCardsPage;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.$$;
import static com.codeborne.selenide.Selenide.sleep;

public class GamesCasualPage extends ContainsCardsPage<GameCard> {

    private static final By GAMES_SELECTOR = By.xpath("//*[@class='ugrid_i']");
    private static final By GAME_OK = By.xpath("//*[@class='tico_img ic ic_group']");

    public GamesCasualPage(){
        super();
    }

    @Override
    public List<GameCard> wrapCards() {
        return searchElementsListNotEmpty(GAMES_SELECTOR).stream()
                .map(GameCard::new).collect(Collectors.toList());
    }

    @Override
    protected void check() {
    }
}
