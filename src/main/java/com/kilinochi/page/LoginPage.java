package com.kilinochi.page;

import com.kilinochi.page.factory.PageFactory;
import com.kilinochi.page.factory.Pages;
import com.kilinochi.page.factory.UserPageFactory;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.kilinochi.ConstUtils.TECHO_BOT_1_LOGIN;
import static com.kilinochi.ConstUtils.PASSWORD;

public final class LoginPage implements Page {

    private static final By LOGIN_LOCATOR = By.name("st.email");
    private static final By PASSWORD_LOCATOR = By.name("st.password");
    private static final By SUBMIT_LOCATOR = By.xpath(".//input[@data-l='t,sign_in']");

    public LoginPage() {

    }

    public UserPage login() {
        $(LOGIN_LOCATOR).setValue(TECHO_BOT_1_LOGIN);
        $(PASSWORD_LOCATOR).setValue(PASSWORD);
        $(SUBMIT_LOCATOR).click();
        final PageFactory pageFactory
                = PageFactory.getFactory(Pages.UserPage);
        return (UserPage) pageFactory.create();
    }

    @Override
    public void check() {

    }
}
