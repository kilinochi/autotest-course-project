import com.kilinochi.page.LoginPage;
import com.kilinochi.page.UserPage;
import com.kilinochi.page.factory.PageFactory;
import com.kilinochi.page.factory.Pages;
import com.kilinochi.page.groups.GroupsPage;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.open;

public final class LoginTest {

    @Test
    public void login() {
        open("https://ok.ru/");
        final LoginPage loginPage = (LoginPage) PageFactory
                .getFactory(Pages.LoginPage)
                .create();
        final UserPage userPage = loginPage.login();
        final GroupsPage groupsPage = userPage.clickToGroups();
    }
}
