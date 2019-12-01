package com.kilinochi.page.groups.sideBar;

import com.codeborne.selenide.CollectionCondition;
import com.kilinochi.page.groups.card.MyGroupsCard;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public final class GroupsSideBar {
    private static final By MY_GROUPS_LOCATOR = By.xpath("//*[@id='hook_Block_MyGroupsNavBlock']/div/div[1]/div/a");
    private static final By GROUPS_CARDS_LOCATORS = By.xpath("//*[ @class ='ucard-v __trimmed']");


    public List<MyGroupsCard> myGroupsCards() {
        $(MY_GROUPS_LOCATOR).click();
        return $$(GROUPS_CARDS_LOCATORS).shouldBe(CollectionCondition.sizeNotEqual(0), 7000)
                .stream()
                .map(MyGroupsCard::new)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
