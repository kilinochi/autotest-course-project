package com.kilinochi.page.user.form;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.kilinochi.page.Layer;
import com.kilinochi.page.user.UserPage;
import com.kilinochi.page.user.layer.CreatePostLayer;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public final class PostForm {

    private static final By POST_FORM_LOCATOR = By.xpath("//*[@id ='hook_Block_PostingForm']");

    private final UserPage context;
    private final SelenideElement inputElement;

    public PostForm(final UserPage context) {
        final SelenideElement rootElement = $(POST_FORM_LOCATOR);
        inputElement = rootElement.find(".pf-head_cnt").should(Condition.visible);
        this.context = context;
    }

    public Layer postLayer() {
        inputElement.click();
        return new CreatePostLayer(context);
    }
}
