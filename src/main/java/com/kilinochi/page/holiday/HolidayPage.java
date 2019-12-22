package com.kilinochi.page.holiday;

import com.kilinochi.page.BasePage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class HolidayPage extends BasePage {

    private static final By HOLIDAYADD_LOCATOR = By.xpath("//*[@tsid=\"events_navigation_add\"]");
    public HolidayPage(){
        super();
    }

    public HolidayTab addHoliday(){
        $(HOLIDAYADD_LOCATOR).click();
        sleep(1000);
        return new HolidayTab();
    }

    @Override
    public void check(){

    }
}
