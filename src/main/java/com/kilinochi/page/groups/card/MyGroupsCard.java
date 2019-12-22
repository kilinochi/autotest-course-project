package com.kilinochi.page.groups.card;

import com.codeborne.selenide.SelenideElement;

import com.kilinochi.page.Card;
import com.kilinochi.page.group.GroupPage;

public final class MyGroupsCard implements Card {

    private final SelenideElement element;

    public MyGroupsCard(SelenideElement element) {
        this.element = element;
    }

    public GroupPage group() {
        element.click();
        return new GroupPage();
    }
}
