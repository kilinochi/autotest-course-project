import com.kilinochi.page.music.MusicPage;
import com.kilinochi.page.music.tab.card.RadioStationCard;
import org.junit.Test;

import java.util.List;

public final class PlayRadioTest extends BaseTest {

    @Test
    public void playRadio() {
        final MusicPage musicPage = userPage.getToolBar().musicPage();
        final List<RadioStationCard> stationCards = musicPage.radioTab().radioStations();
        stationCards.stream()
                .map(radioStationCard -> radioStationCard.withName("Альтернативный рок"))
                .findFirst().get().playRadio();
    }
}
