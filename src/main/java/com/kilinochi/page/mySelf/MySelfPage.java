package com.kilinochi.page.mySelf;

import com.kilinochi.page.BasePage;
import org.openqa.selenium.By;

public final class MySelfPage extends BasePage {

    private static final By WORK_LOCATOR = By.xpath("//*[@hrefattrs=\"st.cmd=userProfile&cmd=PopLayer&st.layer.cmd=PopLayerJoinCommunity&st.layer._stab=5&st.layer.block=AboutUserRB&st._aid=AboutUser_Self_communityAdd\"]");

    public MySelfTab mySelfTab() {
        click(WORK_LOCATOR);
        return new MySelfTab();
    }

    @Override
    protected void check() {
        explicitWaitVisible(WORK_LOCATOR);
    }
}



