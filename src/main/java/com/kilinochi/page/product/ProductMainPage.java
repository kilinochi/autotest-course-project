package com.kilinochi.page.product;

import com.kilinochi.page.BasePage;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class ProductMainPage extends BasePage {

    private static final By FIND_SELECTOR = By.name("st.query");

    public ProductMainPage(){
        super();
    }

    public ProductsListPage findProduct(final String name){
        $(FIND_SELECTOR).setValue(name);
        $(FIND_SELECTOR).pressEnter();
        return new ProductsListPage();
    }
    @Override
    protected void check() {
        // assertEquals("работа", jobOk.getText());
    }
}
