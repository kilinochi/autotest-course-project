package com.kilinochi.page.product;

import com.kilinochi.page.BasePage;
import org.apache.commons.lang3.StringUtils;
import org.jetbrains.annotations.NotNull;
import org.openqa.selenium.By;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static com.codeborne.selenide.Selenide.$;


public class ProductsListPage extends BasePage {

    private static final By COUNT_SELECTOR = By.xpath("//*[@class=\"portlet_h_count\"]");
    private static final By COLOR_SELECTOR = By.id("c_id_4");
    private static final By PRICE_FROM = By.id("mallSearchMinPrice");
    private static final By SORTING_PRICE = By.id("mallsortby");
    private static final By COUNT = By.xpath("//*[@class=\"portlet_h_count\"]");
    private static final Pattern COUNT_PATTERN = Pattern.compile("\\w+([\\s\\d]+)\\w+");


    public ProductsListPage() {
        super();
    }

    @NotNull
    public ProductsListPage setPrice(final int from){
        $(PRICE_FROM).setValue(String.valueOf(from));
   //     $(PRICE_FROM).pressEnter();
        return this;
    }
    @NotNull
    public ProductsListPage sortingPrice(final String sort){
        $(SORTING_PRICE).selectOptionByValue(sort);
        return this;
    }

    public int getCount(){
        String str = $(COUNT).getText();
        Matcher matcher = COUNT_PATTERN.matcher(str);
      if (matcher.find()) {
           String count = StringUtils.remove(matcher.group(), ' ');
           return Integer.parseInt(count);
       }
        return Integer.parseInt(str);
    }

    @Override
    protected void check() {
    }
}
