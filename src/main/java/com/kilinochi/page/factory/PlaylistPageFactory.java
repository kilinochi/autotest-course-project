package com.kilinochi.page.factory;

import com.kilinochi.page.Page;
import com.kilinochi.page.music.PlaylistPage;

public final class PlaylistPageFactory implements PageFactory {

    public PlaylistPageFactory() {

    }

    @Override
    public Page create() {
        return new PlaylistPage();
    }
}
