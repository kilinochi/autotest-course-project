package com.kilinochi.page.groups.layer;

import com.kilinochi.page.BasePage;
import com.kilinochi.page.group.GroupPage;
import org.openqa.selenium.By;

public final class ModalDialogLayer extends BasePage {

    //private static final By GROUPS_SELECT_LOCATOR = By.className("create-group-dialog_i");
    private static final By NAME_GROUP_LOCATOR = By.name("st.layer.name");
    private static final By DESCRIPTION_LOCATOR = By.id("field_description");
    private static final By CATEGORY_MENU_AUTO = By.xpath(".//*[@value='subcatVal12001']");
    private static final By AGE_18_SELECTOR = By.xpath(".//*[@value='18']");
    private static final By CREATE_GROUP_BUTTON = By.name("button_create");

    public ModalDialogLayer() {
        super();
    }

    @Override
    protected void check() {
        explicitWaitPresent(NAME_GROUP_LOCATOR);
        explicitWaitPresent(DESCRIPTION_LOCATOR);
        explicitWaitPresent(CATEGORY_MENU_AUTO);
        explicitWaitPresent(AGE_18_SELECTOR);
        explicitWaitPresent(CREATE_GROUP_BUTTON);
    }

    public ModalDialogLayer inputName(final String name) {
        sendText(NAME_GROUP_LOCATOR, name);
        return this;
    }

    public ModalDialogLayer sendDescription(final String description) {
        sendText(DESCRIPTION_LOCATOR, description);
        return this;
    }

    public ModalDialogLayer selectSubcategory(final GroupPage.Subcategory subcategory) {
        if (subcategory == GroupPage.Subcategory.AUTO) {
            click(CATEGORY_MENU_AUTO);
        }
        return this;
    }

    public ModalDialogLayer selectRestriction(final boolean restriction) {
        if (restriction) {
            click(AGE_18_SELECTOR);
        }
        return this;
    }

    public GroupPage groupPage() {
        click(CREATE_GROUP_BUTTON);
        return new GroupPage();
    }
}
