package com.kilinochi.page.groups;

import com.kilinochi.page.BasePage;
import com.kilinochi.page.groups.layer.SelectGroupsDialogLayer;
import org.openqa.selenium.By;

public final class GroupsPage extends BasePage {

    private static final By CREATE_GROUP_LOCATOR = By.className("create-group");
    private static final By SEARCH_GROUPS_PLACEHOLDER = By.xpath("//*[@id ='hook_Block_UserGroupSearch2QueryBlock']");
    private static final By OWNER_SIDEBAR_LOCATOR = By.xpath("//*[@hrefattrs =\"st.cmd=userGroups&st._aid=GroupsSubMenu_User_MyGroupsNav_Header\"]");

    public GroupsPage() {
        super();
    }

    public SelectGroupsDialogLayer dialogLayer() {
        click(CREATE_GROUP_LOCATOR);
        return new SelectGroupsDialogLayer();
    }

    @Override
    protected void check() {
        explicitWaitVisible(CREATE_GROUP_LOCATOR);
        matchText(CREATE_GROUP_LOCATOR, "Создать группу");
    }
}
