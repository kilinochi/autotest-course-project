package com.kilinochi.page.groups.layer;

import com.codeborne.selenide.CollectionCondition;
import com.kilinochi.page.BasePage;
import com.kilinochi.page.groups.card.GroupPageTypeCard;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.$$;

public final class SelectGroupsDialogLayer extends BasePage {

    private static final By GROUPS_SELECT_LOCATOR = By.className("create-group-dialog_i");

    public SelectGroupsDialogLayer() {
        super();
    }

    @Override
    protected void check() {

    }

    public List<GroupPageTypeCard> typeCards() {
        return $$(GROUPS_SELECT_LOCATOR).shouldBe(CollectionCondition.sizeNotEqual(0), 1000)
                .stream()
                .map(GroupPageTypeCard::new)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
