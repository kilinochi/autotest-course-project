import com.kilinochi.page.music.MusicPage;
import com.kilinochi.page.music.RadioPage;
import com.kilinochi.page.music.card.RadioStationCard;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public final class PlayRadioTest extends BaseTest {

    @Test
    public void playRadio() {
        final MusicPage musicPage = userPage.getToolBar().musicPage();
        final RadioPage radioPage = musicPage.clickToRadioTab();
        final List<RadioStationCard> stationCards = radioPage.wrapCards();

        assertFalse(stationCards.isEmpty());

        final RadioStationCard radioStationCard = stationCards.stream()
                .map(stationCard -> stationCard.withName("Альтернативный рок"))
                .findFirst().get();

        radioStationCard.playRadio();

        assertTrue(radioStationCard.isMusicPlay());
    }
}
