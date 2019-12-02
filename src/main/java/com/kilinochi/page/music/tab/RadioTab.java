package com.kilinochi.page.music.tab;

import com.codeborne.selenide.CollectionCondition;
import com.kilinochi.page.music.tab.card.RadioStationCard;
import org.openqa.selenium.By;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static com.codeborne.selenide.Selenide.$$;

public final class RadioTab {
    private static final By RADIO_STATIONS_LOCATOR = By.xpath("//*[@data-l ='t,radio-station']");

    public List<RadioStationCard> radioStations() {
        return $$(RADIO_STATIONS_LOCATOR).shouldBe(CollectionCondition.sizeNotEqual(0), 7000)
                .stream()
                .map(RadioStationCard::new)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
