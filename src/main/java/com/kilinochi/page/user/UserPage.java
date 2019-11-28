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

    public GroupsPage clickToGroups() {
        $(GROUPS_LOCATOR).click();
        return (GroupsPage) PageFactory
                .getFactory(Pages.GroupsPage)
                .create();
    }

    @Override
    public void check() {

    }
}
