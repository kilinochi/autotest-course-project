import com.kilinochi.page.games.GamePage;
import com.kilinochi.page.games.GamesCasualPage;
import com.kilinochi.page.games.GamesPage;
import org.junit.Test;

public final class GetGameTest extends BaseTest {
    @Test
    public void loadGame() {
        final GamesPage gamesPage = userPage.gamesPage();
        final GamesCasualPage gamesCasualPage = gamesPage.toCasualPage();
        final GamePage gamePage = gamesCasualPage.getFirstNCards(3).stream().findFirst().get().openGame();
        gamePage.fullScreen();
    }
}
