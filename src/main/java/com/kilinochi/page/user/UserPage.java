package com.kilinochi.page.user;

import com.codeborne.selenide.Condition;
import com.kilinochi.page.Page;
import com.kilinochi.page.factory.PageFactory;
import com.kilinochi.page.factory.Pages;
import com.kilinochi.page.groups.GroupsPage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public final class UserPage implements Page {

    private static final By GROUPS_LOCATOR = By.xpath("//*[@hrefattrs=\"st.cmd=userAltGroup&st._aid=NavMenu_User_AltGroups\"]");
    private static final By NAV_BAR_LOCATOR = By.xpath("//*[@class ='nav-side __navigation']");

    public GroupsPage groups() {
        $(GROUPS_LOCATOR).click();
        return (GroupsPage) PageFactory
                .getFactory(Pages.GroupsPage)
                .create();
    }

    @Override
    public Page check() {
        $(NAV_BAR_LOCATOR).should(Condition.visible);
        return this;
    }
}
