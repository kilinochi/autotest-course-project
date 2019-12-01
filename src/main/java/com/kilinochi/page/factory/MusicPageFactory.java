package com.kilinochi.page.factory;

import com.kilinochi.page.Page;
import com.kilinochi.page.groups.music.MusicPage;

public final class MusicPageFactory implements PageFactory {
    @Override
    public Page create() {
        return new MusicPage();
    }
}
