package com.kilinochi.page.factory;

import com.kilinochi.page.Page;

public interface PageFactory {
    Page create();

    static PageFactory getFactory(Pages pages) {
        switch (pages) {
            case UserPage:
                return new UserPageFactory();
            case LoginPage:
                return new LoginPageFactory();
            case GroupsPage:
                return new GroupsPageFactory();
            case GroupPage:
                return new GroupPageFactory();
            case MusicPage:
                return new MusicPageFactory();
            case PlaylistPage:
                return new PlaylistPageFactory();
            case VideoPage:
                return new VideoPageFactory();
            case GamesPage:
                return new GamesPageFactory();
            case MySelfPage:
                return new MySelfPageFactory();
            default:
                throw new IllegalArgumentException();
        }
    }
}