package com.kilinochi.page.games;

import com.codeborne.selenide.CollectionCondition;
import com.kilinochi.page.Page;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.$$;

public class GamesCasualPage implements Page {

    private static final By GAMES_SELECTOR = By.xpath("//*[@class='ugrid_i']");


    public Collection<GameCard> getCards() {
        return  $$(GAMES_SELECTOR).shouldBe(CollectionCondition.sizeNotEqual(0)).stream()
                .map(GameCard::new).collect(Collectors.toCollection(ArrayList::new));
    }


    @Override
    public Page check() {
        return null;
    }
}
