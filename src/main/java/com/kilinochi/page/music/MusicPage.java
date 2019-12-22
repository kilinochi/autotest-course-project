package com.kilinochi.page.music;

import com.kilinochi.page.BasePage;
import com.kilinochi.page.music.tab.MyMusicTab;
import com.kilinochi.page.music.tab.RadioTab;
import org.openqa.selenium.By;

public final class MusicPage extends BasePage {
    private static final By RADIO_LOCATOR = By.xpath("//*[@data-l ='t,radio']");
    private static final String DOMAIN_TAB_TEMPLATE = ".//*[@class ='wm-menu_link __3121tz%s']";

    public MusicPage() {
        super();
    }

    public RadioTab radioTab() {
        clickOnDomainTab(MusicDomain.RADIO);
        return new RadioTab();
    }

    public MyMusicTab myMusicTab() {
        clickOnDomainTab(MusicDomain.MyMUSIC);
        return new MyMusicTab();
    }

    @Override
    protected void check() {
        explicitWaitVisible(RADIO_LOCATOR);
    }

    private void clickOnDomainTab(MusicDomain domain) {
        String xPath = String.format(DOMAIN_TAB_TEMPLATE, domain.domainName());
        By locator = By.xpath(xPath);
        click(locator);
    }
}
