package com.kilinochi.page.factory;

import com.kilinochi.page.Page;
import com.kilinochi.page.music.MusicPage;

public final class MusicPageFactory implements PageFactory {
    @Override
    public Page create() {
        return new MusicPage();
    }
}
