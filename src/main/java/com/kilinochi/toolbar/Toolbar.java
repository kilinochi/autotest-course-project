package com.kilinochi.toolbar;

import com.kilinochi.page.Page;
import com.kilinochi.page.factory.PageFactory;
import com.kilinochi.page.factory.Pages;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public final class Toolbar {

    private static Toolbar instance;
    private static final By MUSIC_LOCATOR = By.xpath("//*[@id ='hook_Block_MusicToolbarButton']");

    private Toolbar() {

    }

    public static Toolbar getInstance() {
        if(instance == null) {
            instance = new Toolbar();
        }
        return instance;
    }

    public Page musicPage() {
        $(MUSIC_LOCATOR).click();
        return PageFactory.getFactory(Pages.MusicPage).create();
    }
}
