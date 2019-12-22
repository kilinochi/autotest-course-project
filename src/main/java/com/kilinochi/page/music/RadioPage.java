package com.kilinochi.page.music;

import com.kilinochi.page.ContainsCardsPage;
import com.kilinochi.page.music.card.RadioStationCard;
import org.openqa.selenium.By;

import java.util.List;
import java.util.stream.Collectors;

public final class RadioPage extends ContainsCardsPage<RadioStationCard> {
    private static final By RADIO_STATIONS_LOCATOR = By.xpath("//*[@data-l ='t,radio-station']");

    private List<RadioStationCard> radioStations;

    public RadioPage() {
        super();
    }

    @Override
    public List<RadioStationCard> wrapCards() {
        return radioStations;
    }

    @Override
    protected void check() {
        radioStations = searchElementsListNotEmpty(RADIO_STATIONS_LOCATOR).stream()
            .map(RadioStationCard::new)
            .collect(Collectors.toList());
    }
}
