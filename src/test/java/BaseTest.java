import com.kilinochi.page.factory.PageFactory;
import com.kilinochi.page.factory.Pages;
import com.kilinochi.page.login.LoginPage;
import com.kilinochi.page.user.UserPage;
import org.junit.Before;

import static com.codeborne.selenide.Selenide.open;

public abstract class BaseTest {

    protected LoginPage loginPage;
    protected UserPage userPage;

    @Before
    public void setUp() {
        open("https://ok.ru/");
        loginPage = (LoginPage) PageFactory
                .getFactory(Pages.LoginPage)
                .create().check();
        userPage = (UserPage) loginPage.login().check();
    }
}
