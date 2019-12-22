import com.kilinochi.page.user.layer.CreatePostLayer;
import com.kilinochi.page.user.layer.MusicLayer;
import org.junit.Test;

public final class PostInPageTest extends BaseTest {


    @Test
    public void post() {
        final CreatePostLayer postLayer = userPage.clickToCreatePostLocator();
        postLayer.inputText("First post");
        final MusicLayer musicLayer = postLayer.postMusic();
        musicLayer.findMusic("Linkin park").createPost();
    }
}
