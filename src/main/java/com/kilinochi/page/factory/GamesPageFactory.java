package com.kilinochi.page.factory;

import com.kilinochi.page.Page;
import com.kilinochi.page.games.GamesPage;

public final class GamesPageFactory implements PageFactory {
    @Override
    public Page create() {
        return new GamesPage();
    }
}
