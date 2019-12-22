package com.kilinochi.page.groups.card;

import com.codeborne.selenide.SelenideElement;
import com.kilinochi.BaseElement;
import com.kilinochi.page.groups.layer.ModalDialogLayer;

public final class GroupPageTypeCard extends BaseElement {

    private final SelenideElement element;

    public GroupPageTypeCard(SelenideElement element) {
        this.element = element;
    }

    public ModalDialogLayer dialogLayer() {
        element.click();
        return new ModalDialogLayer();
    }
}
