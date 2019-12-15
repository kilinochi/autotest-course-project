package com.kilinochi.page.factory;

import com.kilinochi.page.Page;
import com.kilinochi.page.video.VideoPage;

public final class VideoPageFactory implements PageFactory {
    @Override
    public Page create() {
        return new VideoPage();
    }
}

