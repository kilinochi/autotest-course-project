package com.kilinochi.page;

import java.util.List;

public abstract class ContainsCardsPage <T extends Card> extends BasePage {
    public ContainsCardsPage() {
        super();
    }

    public abstract List<T> wrapCards();
}
