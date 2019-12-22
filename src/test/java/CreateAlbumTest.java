import com.kilinochi.page.music.MusicAlbumPage;
import com.kilinochi.page.music.MusicPage;
import com.kilinochi.page.music.PlaylistPage;
import com.kilinochi.page.music.tab.MyMusicTab;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public final class CreateAlbumTest extends BaseTest {
    private static final String ALBUM_NAME = "LINKIN PARK";
    private static final int COUNT_MUSIC_IN_ALBUM = 6;

    @Test
    public void createAlbum() {
        final MusicPage musicPage = userPage.getToolBar().musicPage();
        final MyMusicTab myMusicTab = musicPage.myMusicTab();
        final PlaylistPage playlistPage = myMusicTab.playlistPage();
        final MusicAlbumPage musicAlbumPage = playlistPage.inputAlbumName(ALBUM_NAME)
                .addMusicFromSearch(ALBUM_NAME, COUNT_MUSIC_IN_ALBUM);
        assertEquals(ALBUM_NAME, musicAlbumPage.getAlbumName());
        assertEquals(6, musicAlbumPage.getTracks().size());
    }
}
