package com.kilinochi.page.user;

import com.kilinochi.page.BasePage;
import com.kilinochi.page.mySelf.MySelfPage;
import com.kilinochi.toolbar.Toolbar;
import com.kilinochi.page.groups.GroupsPage;
import com.kilinochi.page.games.GamesPage;
import org.openqa.selenium.By;

import java.util.List;
import java.util.stream.Collectors;

public final class UserPage extends BasePage {

    private static final By GROUPS_LOCATOR = By.xpath("//*[@hrefattrs=\"st.cmd=userAltGroup&st._aid=NavMenu_User_AltGroups\"]");
    private static final By GAMES_LOCATOR = By.xpath("//*[@hrefattrs=\"st.cmd=appsShowcaseHD&st._aid=NavMenu_User_Apps\"]");
   // private static final By MYSELF_LOCATOR = By.xpath("//*[@hrefattrs=\"st.cmd=userProfile&st._aid=NavMenu_User_SelfProfile\"]");
    private static final By NAV_BAR_LOCATOR = By.xpath("//*[@class ='nav-side __navigation']");
    private static final By MORE_LOCATOR = By.xpath("//*[@data-l=\"t,toggler\"]");
    private static final By MAIN_POST_LOCATOR = By.xpath("//*[@id ='hook_Block_MainFeedsNewFeed']");
    private static final By POST_FORM_LOCATOR_INPUT = By.xpath(".//*[@class ='pf-head_cnt']");
    private static final By MAIN_FEED_POST_LOCATOR = By.xpath(".//*[@id ='hook_Block_MainFeedsNewFeed']");
    private static final By FEEDS_TEXT = By.xpath(".//*[@class ='media-text_cnt']");

    public UserPage() {
        super();
    }

    public boolean isFeedsExists() {
        return isElementVisible(MAIN_FEED_POST_LOCATOR);
    }

    public List<String> getFeedText() {
        return searchElementsListNotEmpty(FEEDS_TEXT).stream().map(element-> element.find("[data-l]")
                .getText()).collect(Collectors.toList());
    }

    public GroupsPage clickToGroupsPage() {
        click(GROUPS_LOCATOR);
        return new GroupsPage();
    }

    public GamesPage gamesPage() {
        click(GAMES_LOCATOR);
        return new GamesPage();
    }


    public MySelfPage mySelfPage() {
        click(MORE_LOCATOR);
     //   click(MYSELF_LOCATOR);
        return new MySelfPage();
    }

    public CreatePostPage clickToCreatePostLocator() {
        click(POST_FORM_LOCATOR_INPUT);
        return new CreatePostPage();
    }

    public Toolbar getToolBar() {
        return Toolbar.getInstance();
    }

    @Override
    protected void check() {
        explicitWaitVisible(GROUPS_LOCATOR);
        explicitWaitVisible(POST_FORM_LOCATOR_INPUT);
     //   explicitWaitVisible(MYSELF_LOCATOR);
        explicitWaitVisible(NAV_BAR_LOCATOR);
    }
}
