package com.kilinochi.page.groups.card;

import com.codeborne.selenide.SelenideElement;
import com.kilinochi.page.factory.PageFactory;
import com.kilinochi.page.factory.Pages;
import com.kilinochi.page.group.GroupPage;

public final class MyGroupsCard {

    private final SelenideElement element;

    public MyGroupsCard(SelenideElement element) {
        this.element = element;
    }

    public GroupPage group() {
        element.click();
        return (GroupPage) PageFactory
                .getFactory(Pages.GroupPage)
                .create();
    }
}
