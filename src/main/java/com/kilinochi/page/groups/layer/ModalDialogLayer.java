package com.kilinochi.page.groups.layer;

import com.codeborne.selenide.SelenideElement;
import com.kilinochi.page.Page;
import com.kilinochi.page.factory.PageFactory;
import com.kilinochi.page.factory.Pages;
import com.kilinochi.page.group.GroupPage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public final class ModalDialogLayer {

    //private static final By GROUPS_SELECT_LOCATOR = By.className("create-group-dialog_i");
    private static final By NAME_GROUP_LOCATOR = By.name("st.layer.name");
    private static final By DESCRIPTION_LOCATOR = By.id("field_description");
    private static final By CATEGORY_MENU_AUTO = By.xpath(".//*[@value='subcatVal12001']");
    private static final By AGE_18_SELECTOR = By.xpath(".//*[@value='18']");
    private static final By CREATE_GROUP_BUTTON = By.name("button_create");

    private final SelenideElement groupName;
    private final SelenideElement groupDescription;
    private final SelenideElement subCategory;
    private final SelenideElement restriction;
    private final SelenideElement creteGroupButton;

    public ModalDialogLayer() {
        groupName = $(NAME_GROUP_LOCATOR);
        groupDescription = $(DESCRIPTION_LOCATOR);
        subCategory = $(CATEGORY_MENU_AUTO);
        restriction = $(AGE_18_SELECTOR);
        creteGroupButton = $(CREATE_GROUP_BUTTON);
    }

    public Page groupPage() {
        creteGroupButton.click();
        return PageFactory.getFactory(Pages.GroupPage).create();
    }
}
