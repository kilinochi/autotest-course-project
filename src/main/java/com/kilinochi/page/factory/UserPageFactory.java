package com.kilinochi.page.factory;

import com.kilinochi.page.Page;
import com.kilinochi.page.UserPage;

public final class UserPageFactory implements PageFactory {

    @Override
    public Page create() {
        return new UserPage();
    }
}
