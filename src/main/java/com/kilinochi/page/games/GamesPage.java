package com.kilinochi.page.games;

import com.codeborne.selenide.CollectionCondition;
import com.codeborne.selenide.Condition;
import com.kilinochi.page.Page;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public final class GamesPage implements Page {

    // локатор элемента который точно будет на странице
    private static final By CASUAL_SELECTOR = By.xpath("//*[@hrefattrs=\"st.cmd=appsShowcaseHD&st.catalog=casual\"]");

    public GamesPage(){
    }

    //public GamePage gamePage(){

        //return cards.stream().findFirst().get().openGame();
   // }


    public GamesCasualPage toCasualPage() {
        /// переход на casual page
        $(CASUAL_SELECTOR).click();
        return new GamesCasualPage();
    }

    @Override
    public Page check() {
        // todo - достато элемент по локатору и применить Shuold B
        return this;
    }

}
