package com.kilinochi.page.groups.card;

import com.codeborne.selenide.SelenideElement;
import com.kilinochi.page.Layer;
import com.kilinochi.page.groups.layer.ModalDialogLayer;

public final class GroupPageTypeCard {

    private final SelenideElement element;

    public GroupPageTypeCard(SelenideElement element) {
        this.element = element;
    }

    public Layer dialogLayer() {
        element.click();
        return new ModalDialogLayer();
    }
}
