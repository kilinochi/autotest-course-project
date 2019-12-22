import com.kilinochi.page.user.CreatePostPage;
import org.junit.Test;

import java.util.List;

import static org.hamcrest.Matchers.hasItems;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

public final class CreateMusicPostTest extends BaseTest {

    private static final String MUSIC_BAND_NAME = "LIMP BIZKIT";
    private static final int MUSIC_TRACK_LIMIT_IN_POST = 3;
    private static final String POST_NAME = "MUSIC POST";

    @Test
    public void createMusicPost() {
        final CreatePostPage postLayer = userPage.clickToCreatePostLocator();
        userPage = postLayer.inputText(POST_NAME)
                .clickToMusicAttachButton()
                .findMusic(MUSIC_BAND_NAME)
                .withLimit(MUSIC_TRACK_LIMIT_IN_POST)
                .attachMusic()
                .addMusic()
                .createPost();

        boolean isHavePosts = userPage.isFeedsExists();

        assertTrue(isHavePosts);

        List<String> feedsTexts = userPage.getFeedText();

        assertThat(feedsTexts, hasItems(POST_NAME));
    }
}
