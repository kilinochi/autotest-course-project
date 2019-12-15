package com.kilinochi.page.login;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.kilinochi.page.Page;
import com.kilinochi.page.user.UserPage;
import com.kilinochi.page.factory.PageFactory;
import com.kilinochi.page.factory.Pages;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.kilinochi.ConstUtils.TECHO_BOT_1_LOGIN;
import static com.kilinochi.ConstUtils.PASSWORD;

public final class LoginPage implements Page {

    private static final By LOGIN_LOCATOR = By.name("st.email");
    private static final By PASSWORD_LOCATOR = By.name("st.password");
    private static final By SUBMIT_LOCATOR = By.xpath("//*[@type=\"submit\"]");


    private final SelenideElement loginInput;
    private final SelenideElement passwordInput;
    private final SelenideElement submitButton;

    public LoginPage() {
        loginInput = $(LOGIN_LOCATOR);
        passwordInput = $(PASSWORD_LOCATOR);
        submitButton = $(SUBMIT_LOCATOR);
        check();
    }

    public UserPage login() {
        loginInput.setValue(TECHO_BOT_1_LOGIN);
        passwordInput.setValue(PASSWORD);
        submitButton.click();
        final PageFactory pageFactory
                = PageFactory.getFactory(Pages.UserPage);
        return (UserPage) pageFactory.create();
    }

    @Override
    public Page check() {
        loginInput.shouldBe(Condition.visible);
        passwordInput.shouldBe(Condition.visible);
        submitButton.shouldHave(Condition.matchesText("Войти"));
        return this;
    }
}
