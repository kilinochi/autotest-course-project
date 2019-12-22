import com.kilinochi.page.games.GamePage;
import com.kilinochi.page.games.GamesCasualPage;
import com.kilinochi.page.games.GamesPage;

import org.junit.Test;

import static com.codeborne.selenide.Selenide.sleep;

public final class GetGameTest extends BaseTest {
    @Test
    public void loadGame()  {
        final GamesPage gamesPage = userPage.gamesPage();
        final GamesCasualPage gamesCasualPage = gamesPage.toCasualPage();
        final GamePage gamePage = gamesCasualPage.getCards().stream().findFirst().get().openGame();
        sleep(4000);
    }
}
