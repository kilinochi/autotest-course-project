package com.kilinochi.page.factory;

import com.kilinochi.page.Page;
import com.kilinochi.page.mySelf.MySelfPage;

public final class MySelfPageFactory implements PageFactory {
    @Override
    public Page create() {
        return new MySelfPage();
    }
}
