package com.kilinochi.page.holiday;

import com.kilinochi.page.BasePage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public class HolidayTab extends BasePage {

    private static final By FIND_LOCATOR = By.name("st.layer.q");
    private static final By CLOSE_LOCATOR = By.id("nohook_modal_close");
    private static final By DAYADD_LOACTOR = By.xpath("//*[@href=\"/dk?cmd=AddRemoveHoliday&st.hId=567844663552&st.ac=ADD&st.or=EVENTS_CALENDAR_POPUP&st.elId=js-holiday-567844663552&st.cmd=eventsCalendar\"]");
    private static String dayString;

    public HolidayTab(){
        super();
    }

    public HolidayTab findHoliday(final String day){
        dayString = day;
        $(FIND_LOCATOR).setValue(day);
        $(FIND_LOCATOR).pressEnter();
        String str = "//td[contains(text(),'" +day+"')]";
        final By LOCATOR = By.xpath(str);
        $(LOCATOR).click();
        sleep(1000);
        $(DAYADD_LOACTOR).click();
        sleep(2000);
        $(CLOSE_LOCATOR).click();
        return this;
    }

    @Override
    protected void check(){

    }
}
