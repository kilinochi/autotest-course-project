package com.kilinochi.toolbar;

import com.codeborne.selenide.Condition;
import com.kilinochi.page.Page;
import com.kilinochi.page.factory.PageFactory;
import com.kilinochi.page.factory.Pages;
import com.kilinochi.page.video.VideoPage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public final class Toolbar {

    private static Toolbar instance;
    private static final By MUSIC_LOCATOR = By.xpath("//*[@id ='hook_Block_MusicToolbarButton']");
    private static final By VIDEO_LOCATOR = By.xpath("//*[@id=\"hook_Block_ToolbarVideoCounter\"]");

    private Toolbar() {

    }

    public static Toolbar getInstance() {
        if(instance == null) {
            instance = new Toolbar();
        }
        return instance;
    }

    public Page musicPage() {
        $(MUSIC_LOCATOR).shouldHave(Condition.text("Музыка")).click();
        return PageFactory.getFactory(Pages.MusicPage).create();
    }

    public VideoPage videoPage() {
        $(VIDEO_LOCATOR).shouldHave(Condition.text("Видео")).click();
        return (VideoPage) PageFactory.getFactory(Pages.VideoPage).create();
    }
}
