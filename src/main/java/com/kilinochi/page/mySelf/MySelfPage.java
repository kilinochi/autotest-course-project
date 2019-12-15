package com.kilinochi.page.mySelf;

import com.codeborne.selenide.Condition;
import com.kilinochi.page.Page;
import com.kilinochi.page.factory.PageFactory;
import com.kilinochi.page.factory.Pages;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public final class MySelfPage implements Page{

    private static final By EDIT_LOCATOR = By.xpath("//*[@href=\"/profile/577417727191/about\"]");
    private static final By WORK_LOCATOR = By.xpath("//*[@hrefattrs=\"st.cmd=userProfile&cmd=PopLayer&st.layer.cmd=PopLayerJoinCommunity&st.layer._stab=5&st.layer.block=AboutUserRB&st._aid=AboutUser_Self_communityAdd\"]");


    public MySelfTab mySelfTab() {
        $(WORK_LOCATOR).click();
       // $(EDIT_LOCATOR).contextClick();

        return new MySelfTab();
    }


    @Override
    public Page check() {
        return null;
    }
}



