import com.kilinochi.page.user.form.PostForm;
import com.kilinochi.page.user.layer.CreatePostLayer;
import com.kilinochi.page.user.layer.MusicLayer;
import org.junit.Test;

public final class PostInPageTest extends BaseTest {


    @Test
    public void post() {
        final PostForm form = userPage.postForm();
        final CreatePostLayer postLayer = (CreatePostLayer) form.postLayer();
        postLayer.inputText("First post");
        final MusicLayer musicLayer = postLayer.postMusic();
        musicLayer.findMusic("Linkin park").createPost();
    }
}
