import com.kilinochi.page.music.MusicPage;
import com.kilinochi.page.music.PlaylistPage;
import com.kilinochi.page.music.tab.MyMusicTab;
import org.junit.Test;

public final class CreateAlbumTest extends BaseTest {

    @Test
    public void createAlbum() {
        final MusicPage musicPage = userPage.getToolBar().musicPage();
        final MyMusicTab myMusicTab = musicPage.myMusicTab();
        final PlaylistPage playlistPage = myMusicTab.playlistPage();
        playlistPage.inputAlbumName("Linkin Park").addMusicFromSearch("Linkin Park", 6);
    }
}
