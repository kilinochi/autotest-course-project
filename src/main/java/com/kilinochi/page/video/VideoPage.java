package com.kilinochi.page.video;

import com.kilinochi.page.Page;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class VideoPage implements Page{

    private static final By SETTINGS_SELECTOR = By.xpath("//*[ @class ='u-menu_li expand-action-item']");
    private static final By DELETE_GROUP_SELECTOR = By.xpath("//*[@class ='u-menu_li __divided __custom']");
    private static final By DELETE_BUTTON_SELECTOR = By.xpath("//*[@id ='hook_FormButton_button_delete']");

    private String groupId;

    public String getGroupId() {
        return groupId;
    }

    public void deleteGroup() {
        $(SETTINGS_SELECTOR).click();
        $(DELETE_GROUP_SELECTOR).click();
        $(DELETE_BUTTON_SELECTOR).click();
    }

    @Override
    public Page check() {
        return this;
    }

}
