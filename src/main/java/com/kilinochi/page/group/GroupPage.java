package com.kilinochi.page.group;

import com.kilinochi.page.BasePage;
import org.openqa.selenium.By;

public final class GroupPage extends BasePage {

    private static final By SETTINGS_SELECTOR = By.xpath("//*[ @class ='u-menu_li expand-action-item']");
    private static final By DELETE_GROUP_SELECTOR = By.xpath("//*[@class ='u-menu_li __divided __custom']");
    private static final By DELETE_BUTTON_SELECTOR = By.xpath("//*[@id ='hook_FormButton_button_delete']");

    public GroupPage() {
        super();
    }

    private String groupId;

    public String getGroupId() {
        return groupId;
    }

    @Override
    protected void check() {

    }

    public enum Subcategory {
        AUTO
    }
}
