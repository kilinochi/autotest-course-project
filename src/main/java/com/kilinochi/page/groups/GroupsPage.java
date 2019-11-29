package com.kilinochi.page.groups;

import com.kilinochi.page.Layer;
import com.kilinochi.page.Page;
import com.kilinochi.page.groups.layer.SelectGroupsDialogLayer;
import com.kilinochi.page.groups.sideBar.GroupsSideBar;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public final class GroupsPage implements Page {

    private static final By CREATE_GROUP_LOCATOR = By.className("create-group");
    private static final By SEARCH_GROUPS_PLACEHOLDER = By.xpath("//*[@id ='hook_Block_UserGroupSearch2QueryBlock']");
    private static final By OWNER_SIDEBAR_LOCATOR = By.xpath("//*[@hrefattrs =\"st.cmd=userGroups&st._aid=GroupsSubMenu_User_MyGroupsNav_Header\"]");


    public GroupsSideBar myGroups() {
        $(OWNER_SIDEBAR_LOCATOR).click();
        return new GroupsSideBar();
    }

    public Layer dialogLayer() {
        $(CREATE_GROUP_LOCATOR).click();
        return new SelectGroupsDialogLayer();
    }

    @Override
    public void check() {

    }
}
