package com.kilinochi.page.group;

import com.kilinochi.page.Page;

public final class GroupPage implements Page {

    private String groupId;

    @Override
    public void check() {

    }

    public String getGroupId() {
        return groupId;
    }

    public enum Subcategory {
        AUTO
    }
}
