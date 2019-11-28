import com.kilinochi.page.LoginPage;
import com.kilinochi.page.UserPage;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public final class LoginTest {


    @Test
    public void login() {
        open("https://ok.ru/");
        final LoginPage loginPage = new LoginPage();
        final UserPage userPage = loginPage.login();
    }
}
