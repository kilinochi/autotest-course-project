package com.kilinochi.page.group;

import com.kilinochi.page.Page;

public final class GroupPage implements Page {

    private String groupId;

    public String getGroupId() {
        return groupId;
    }

    @Override
    public Page check() {
        return this;
    }

    public enum Subcategory {
        AUTO
    }
}
