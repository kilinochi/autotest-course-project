package com.kilinochi.page.groups.layer;

import com.kilinochi.page.ContainsCardsPage;
import com.kilinochi.page.groups.card.GroupPageTypeCard;
import org.openqa.selenium.By;

import java.util.List;
import java.util.stream.Collectors;

public final class SelectGroupsDialogLayer extends ContainsCardsPage<GroupPageTypeCard> {

    private static final By GROUPS_SELECT_LOCATOR = By.className("create-group-dialog_i");

    public SelectGroupsDialogLayer() {
        super();
    }

    @Override
    public List<GroupPageTypeCard> wrapCards() {
        return searchElementsListNotEmpty(GROUPS_SELECT_LOCATOR).stream().map(GroupPageTypeCard::new)
                .collect(Collectors.toList());

    }

    @Override
    protected void check() {

    }
}
