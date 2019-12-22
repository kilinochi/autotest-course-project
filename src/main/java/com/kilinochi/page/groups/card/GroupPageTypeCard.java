package com.kilinochi.page.groups.card;

import com.codeborne.selenide.SelenideElement;

import com.kilinochi.page.Card;
import com.kilinochi.page.groups.layer.ModalDialogLayer;

public final class GroupPageTypeCard implements Card {

    private final SelenideElement element;

    public GroupPageTypeCard(SelenideElement element) {
        this.element = element;
    }

    public ModalDialogLayer selectCreateDialogLayer() {
        element.click();
        return new ModalDialogLayer();
    }
}
