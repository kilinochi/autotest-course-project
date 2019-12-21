package com.kilinochi.toolbar;

import com.kilinochi.BaseElement;
import com.kilinochi.page.music.MusicPage;
import com.kilinochi.page.video.VideoPage;
import org.openqa.selenium.By;

public final class Toolbar extends BaseElement {

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

    public MusicPage musicPage() {
        click(MUSIC_LOCATOR);
        return new MusicPage();
    }

    public VideoPage videoPage() {
        click(VIDEO_LOCATOR);
        return new VideoPage();
    }
}
