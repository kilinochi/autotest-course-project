import com.kilinochi.page.music.MusicPage;
import com.kilinochi.page.music.radio.card.RadioStationCard;
import org.junit.Test;

import java.util.List;

public final class MusicTest extends BaseTest {

    @Test
    public void playRadio() {
        final MusicPage musicPage = (MusicPage) userPage.toolbar().musicPage();
        final List<RadioStationCard> stationCards = musicPage.radioTab().radioStations();
        stationCards.get(0).playRadio();
    }
}
