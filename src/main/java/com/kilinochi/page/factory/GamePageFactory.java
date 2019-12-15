package com.kilinochi.page.factory;

import com.kilinochi.page.Page;
import com.kilinochi.page.games.GamePage;

public class GamePageFactory implements PageFactory {
    @Override
    public Page create() {
        return new GamePage();
    }
}
