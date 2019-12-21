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

    private SelenideElement loginInput;
    private SelenideElement passwordInput;
    private SelenideElement submitButton;

    public LoginPage() {
        super();
    }

    public LoginPage withLogin(String login) {
        loginInput.setValue(login);
        return this;
    }

    public LoginPage withPassword(String password) {
        passwordInput.setValue(password);
        return this;
    }

    public UserPage loginToOK() {
        submitButton.click();
        return new UserPage();
    }

    @Override
    protected void check() {
        loginInput = explicitWaitVisible(LOGIN_LOCATOR);
        passwordInput = explicitWaitVisible(PASSWORD_LOCATOR);
        submitButton = explicitWaitVisible(SUBMIT_LOCATOR);
        String submitAttr = submitButton.attr("value");
        assertEquals("Войти", submitAttr);
    }
}
