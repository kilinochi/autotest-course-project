package com.kilinochi.page.mySelf;


import com.codeborne.selenide.SelenideElement;
import com.kilinochi.page.Layer;
import com.kilinochi.page.Page;
import com.kilinochi.page.factory.PageFactory;
import com.kilinochi.page.factory.Pages;
import com.kilinochi.page.mySelf.MySelfPage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public final class MySelfTab  implements Layer {

    private static final By NAME_LOCATOR = By.name("fr.name");
    private static final By JOB_LOCATOR = By.name("st.layer.jobText");
    private static final By JOB2_LOCATOR = By.xpath("//*[@id=\"gwt-uid-2299\"]");
    private static final By JOBPOSITION_LOCATOR = By.name("st.layer.jobPositionText");

    private final SelenideElement Name;
    private final SelenideElement jobName;
    private final SelenideElement jobName2;
    private final SelenideElement jobPosition;

     public MySelfTab() {
       Name = $(NAME_LOCATOR);
       jobName = $(JOB_LOCATOR);
       jobName2 = $(JOB2_LOCATOR);
       jobPosition = $(JOBPOSITION_LOCATOR);
     }

    // public MySelfTab inputName(final String name) {
    //    Name.setValue(name);
     //   return this;
    // }

    public MySelfTab inputName(final String name) {
        jobName.setValue(name);
        //$("#submit").click();
        // executeJavaScript("return Ext.ComponentQuery.query(component)");
        sleep(3000);
        return this;
    }

    public MySelfTab inputPosition(final String name) {
        jobPosition.setValue(name);
        return this;
    }


}
