package com.kilinochi.page.groups;

import com.kilinochi.page.Page;
import com.kilinochi.page.groups.sideBar.GroupsSideBar;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public final class GroupsPage implements Page {

    private static final By CREATE_GROUP_LOCATOR = By.className("create-group");
    private static final By SEARCH_GROUPS_PLACEHOLDER = By.xpath("//*[@id ='hook_Block_UserGroupSearch2QueryBlock']");
    private static final By OWNER_SIDEBAR_LOCATOR = By.xpath("//*[@id ='hook_Block_MyGroupsNavBlock']");


    public GroupsSideBar clickToMyGroups() {
        $(OWNER_SIDEBAR_LOCATOR).click();
        return new GroupsSideBar();
    }

    @Override
    public void check() {

    }
}
