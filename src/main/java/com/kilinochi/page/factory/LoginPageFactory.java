package com.kilinochi.page.factory;

import com.kilinochi.page.login.LoginPage;
import com.kilinochi.page.Page;

public final class LoginPageFactory implements PageFactory {

    LoginPageFactory() {

    }

    @Override
    public Page create() {
        return new LoginPage();
    }
}
