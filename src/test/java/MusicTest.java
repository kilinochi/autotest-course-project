import com.kilinochi.page.groups.music.MusicPage;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public final class MusicTest extends BaseTest {

    @Test
    public void playRadio() {
        final MusicPage musicPage = (MusicPage) userPage.toolbar().musicPage();

    }
}
