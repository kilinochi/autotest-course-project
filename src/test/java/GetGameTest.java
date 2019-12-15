import com.kilinochi.page.games.GameCard;
import com.kilinochi.page.games.GamePage;
import com.kilinochi.page.games.GamesCasualPage;
import com.kilinochi.page.games.GamesPage;
import com.kilinochi.page.Page;
import org.junit.Test;

import java.util.Collection;

public final class GetGameTest extends BaseTest {
    @Test
    public void loadGame() throws InterruptedException {
        final GamesPage gamesPage = userPage.gamesPage();
        final GamesCasualPage gamesCasualPage = gamesPage.toCasualPage();
        final GamePage gamePage = gamesCasualPage.getFirstNCards(3).stream().findFirst().get().openGame();
        gamePage.fullScreen();
        //final  GamesPage p= r.gamePage();

        //final Page gpa = gamePage.fullScreen();
    }
}
