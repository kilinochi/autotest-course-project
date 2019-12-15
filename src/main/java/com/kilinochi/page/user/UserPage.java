package com.kilinochi.page.user;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import com.kilinochi.page.mySelf.MySelfPage;
import com.kilinochi.page.user.form.PostForm;
import com.kilinochi.toolbar.Toolbar;
import com.kilinochi.page.Page;
import com.kilinochi.page.factory.PageFactory;
import com.kilinochi.page.factory.Pages;
import com.kilinochi.page.groups.GroupsPage;
import com.kilinochi.page.games.GamesPage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public final class UserPage implements Page {

    private static final By GROUPS_LOCATOR = By.xpath("//*[@hrefattrs=\"st.cmd=userAltGroup&st._aid=NavMenu_User_AltGroups\"]");
    private static final By GAMES_LOCATOR = By.xpath("//*[@hrefattrs=\"st.cmd=appsShowcaseHD&st._aid=NavMenu_User_Apps\"]");
    private static final By MYSELF_LOCATOR = By.xpath("//*[@hrefattrs=\"st.cmd=userProfile&st._aid=NavMenu_User_SelfProfile\"]");
    private static final By NAV_BAR_LOCATOR = By.xpath("//*[@class ='nav-side __navigation']");
    private static final By TOOLBAR_LOCATOR = By.xpath("//*[@class ='toolbar']");
    private static final By MORE_LOCATOR = By.xpath("//*[@data-l=\"t,toggler\"]");

    public GroupsPage groups() {
        $(GROUPS_LOCATOR).click();
        return (GroupsPage) PageFactory
                .getFactory(Pages.GroupsPage)
                .create();
    }

    public GamesPage gamesPage() {
        $(GAMES_LOCATOR).click();
        return (GamesPage) PageFactory
                .getFactory(Pages.GamesPage)
                .create();
    }


    public MySelfPage mySelfPage() {
        $(MORE_LOCATOR).click();
        $(MYSELF_LOCATOR).click();
        return (MySelfPage) PageFactory
                .getFactory(Pages.MySelfPage)
                .create();
    }


    public PostForm postForm() {
        return new PostForm(this);
    }

    public Toolbar toolbar() {
        return Toolbar.getInstance();
    }

    @Override
    public Page check() {
        $(NAV_BAR_LOCATOR).should(Condition.visible);
        return this;
    }
}
