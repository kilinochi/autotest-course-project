package com.kilinochi.page.user;

import com.kilinochi.page.BasePage;
import com.kilinochi.page.user.layer.MusicLayer;
import org.openqa.selenium.By;

public final class CreatePostPage extends BasePage {

    private static final By CREATE_POST_LOCATOR = By.xpath(".//*[@id ='hook_Block_MediaTopicLayerBody']");
    private static final By PLACEHOLDER_LOCATOR = By.xpath(".//*[@class ='posting_itx emoji-tx h-mod js-ok-e js-posting-itx ok-posting-handler']");
    private static final By SUBMIT_BUTTON_LOCATOR = By.xpath(".//*[@data-action ='submit']");
    private static final By ATTACH_MUSIC_LOCATOR = By.xpath("//*[@data-module ='postingForm/mediaMusicAddButton']");


    public CreatePostPage() {
        super();
    }

    @Override
    protected void check() {
        explicitWaitVisible(CREATE_POST_LOCATOR);
        explicitWaitVisible(PLACEHOLDER_LOCATOR);
        explicitWaitVisible(SUBMIT_BUTTON_LOCATOR);
        explicitWaitVisible(ATTACH_MUSIC_LOCATOR);
    }

    public CreatePostPage inputText(final String text) {
        sendText(PLACEHOLDER_LOCATOR, text);
        return this;
    }

    public MusicLayer clickToMusicAttachButton() {
        click(ATTACH_MUSIC_LOCATOR);
        return new MusicLayer();
    }

    public UserPage createPost() {
        click(SUBMIT_BUTTON_LOCATOR);
        return new UserPage();
    }
}
