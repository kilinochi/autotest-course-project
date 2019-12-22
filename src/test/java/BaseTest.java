import com.kilinochi.page.login.LoginPage;
import com.kilinochi.page.user.UserPage;
import com.kilinochi.toolbar.Toolbar;
import org.junit.After;
import org.junit.Before;

import static com.codeborne.selenide.Selenide.close;
import static com.codeborne.selenide.Selenide.open;
import static com.kilinochi.ConstUtils.TECHO_BOT_1_LOGIN;
import static com.kilinochi.ConstUtils.PASSWORD;

public abstract class BaseTest {

    protected LoginPage loginPage;
    protected UserPage userPage;
    protected Toolbar toolbar;

    @Before
    public void setUp() {
        open("https://ok.ru/");
        loginPage = new LoginPage();
        userPage = loginPage
                .withLogin(TECHO_BOT_1_LOGIN)
                .withPassword(PASSWORD)
                .loginToOK();
        toolbar = userPage.getToolBar();
    }

    @After
    public void clear(){
        close();
    }
}
