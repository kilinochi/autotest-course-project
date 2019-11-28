package com.kilinochi.page.factory;

import com.kilinochi.page.Page;
import com.kilinochi.page.groups.GroupsPage;

public final class GroupsPageFactory implements PageFactory {
    @Override
    public Page create() {
        return new GroupsPage();
    }
}
