package com.kilinochi.page.factory;

import com.kilinochi.page.Page;
import com.kilinochi.page.group.GroupPage;

public final class GroupPageFactory implements PageFactory {
    @Override
    public Page create() {
        return new GroupPage();
    }
}
