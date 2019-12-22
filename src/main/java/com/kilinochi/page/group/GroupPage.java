package com.kilinochi.page.group;

import com.kilinochi.page.BasePage;
import org.openqa.selenium.By;

public final class GroupPage extends BasePage {
    private static final By GROUP_NAME_LOCATOR = By.xpath(".//*[@class ='group-name_t']");
    private static final By RESTRICTION_LOCATOR = By.xpath(".//*[@class ='group-name_badge']");

    private String groupName;

    public GroupPage() {
        super();
    }

    public String groupName() {
        return groupName;
    }

    public boolean isRestrictionGroup() {
        return isElementVisible(RESTRICTION_LOCATOR);
    }

    @Override
    protected void check() {
        groupName = explicitWaitVisible(GROUP_NAME_LOCATOR).find("h1").getText();
    }

    public enum Subcategory {
        AUTO
    }
}
