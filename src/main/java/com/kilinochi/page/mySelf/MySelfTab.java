package com.kilinochi.page.mySelf;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.sleep;
import static org.junit.Assert.assertEquals;

public final class MySelfTab  implements Page {

    private static final By JOB_LOCATOR = By.name("st.layer.jobText");
    private static final By JOB2_LOCATOR = By.xpath("//*[@href=\"/profile/577417727191/about?st.cmd=userProfile&st.layer.cmd=PopLayerClose\"]");
    private static final By JOBPOSITION_LOCATOR = By.name("st.layer.jobPositionText");
    private static final By SUBMIT_LOCATOR = By.name("button_join");
    public static final By JOB_OK = By.xpath("//*[@hrefattrs=\"st.cmd=userProfile&cmd=PopLayer&st.layer.cmd=PopLayerJoinCommunity&st.layer._stab=5&st.layer.block=AboutUserRB&st._aid=MoreCommPromo_addOffice\"]");


    private final SelenideElement jobName;
    private final SelenideElement jobName2;
    private final SelenideElement jobPosition;
    private final SelenideElement jobSubmit;
    private final SelenideElement jobOk;

     public MySelfTab() {
       jobName = $(JOB_LOCATOR);
       jobName2 = $(JOB2_LOCATOR);
       jobPosition = $(JOBPOSITION_LOCATOR);
       jobSubmit = $(SUBMIT_LOCATOR);
       jobOk = $(JOB_OK);
     }

    public void inputName() {
        sleep(1000);
        jobName2.click();
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
    public Page check() {
        assertEquals("работа", jobOk.getText());
        return null;
    }
}
