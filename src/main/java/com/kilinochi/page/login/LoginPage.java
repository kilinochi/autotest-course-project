package com.kilinochi.page.login;

import com.codeborne.selenide.SelenideElement;
import com.kilinochi.page.BasePage;
import com.kilinochi.page.user.UserPage;
import org.openqa.selenium.By;

import static org.junit.Assert.assertEquals;

public final class LoginPage extends BasePage {

    private static final By LOGIN_LOCATOR = By.name("st.email");
    private static final By PASSWORD_LOCATOR = By.name("st.password");
    private static final By SUBMIT_LOCATOR = By.xpath("//*[@type=\"submit\"]");

    public LoginPage() {
        super();
    }

    public LoginPage withLogin(String login) {
        sendText(LOGIN_LOCATOR, login);
        return this;
    }

    public LoginPage withPassword(String password) {
        sendText(PASSWORD_LOCATOR, password);
        return this;
    }

    public UserPage loginToOK() {
        click(SUBMIT_LOCATOR);
        return new UserPage();
    }

    @Override
    protected void check() {
        explicitWaitVisible(LOGIN_LOCATOR);
        explicitWaitVisible(PASSWORD_LOCATOR);
        explicitWaitVisible(SUBMIT_LOCATOR);
    }
}
