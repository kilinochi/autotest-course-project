package com.kilinochi.page.mySelf;

import com.codeborne.selenide.SelenideElement;
import com.kilinochi.page.BasePage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;

public final class MySelfTab extends BasePage {

    private static final By JOB_LOCATOR = By.name("st.layer.jobText");
    private static final By JOB_CLOSE = By.xpath("//*[@class=\"layerPanelClose ic ic_close\"]");
    private static final By JOBPOSITION_LOCATOR = By.name("st.layer.jobPositionText");
    private static final By SUBMIT_LOCATOR = By.name("button_join");
    public static final By JOB_OK = By.xpath("//*[@hrefattrs=\"st.cmd=userProfile&cmd=PopLayer&st.layer.cmd=PopLayerJoinCommunity&st.layer._stab=5&st.layer.block=AboutUserRB&st._aid=MoreCommPromo_addOffice\"]");


    private final SelenideElement jobName;
    private final SelenideElement jobClose;
    private final SelenideElement jobPosition;
    private final SelenideElement jobSubmit;
    private final SelenideElement jobOk;

    public MySelfTab() {
        super();
        jobName = $(JOB_LOCATOR);
        jobClose = $(JOB_CLOSE);
        jobPosition = $(JOBPOSITION_LOCATOR);
        jobSubmit = $(SUBMIT_LOCATOR);
        jobOk = $(JOB_OK);
    }

    public void inputName() {
        sleep(1000);
        jobClose.click();
    }

    public MySelfTab inputName2(final String name) {
        jobName.setValue(name);
        sleep(1000);
        jobName.pressEnter();
        jobPosition.setValue("Чикуня");
        jobSubmit.click();
        return new MySelfTab();
    }

    @Override
    protected void check() {
    }
}
