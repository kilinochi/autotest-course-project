import com.kilinochi.page.mySelf.MySelfPage;
import com.kilinochi.page.mySelf.MySelfTab;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.sleep;

public final class MySelfTest extends BaseTest {

    @Test
    public void createWork() {

        final MySelfPage mySelfPage = userPage.mySelfPage();
        mySelfPage.mySelfTab().inputName();
        final MySelfTab mySelfTab =  mySelfPage.mySelfTab();
        mySelfTab.inputName2("Однокласс");
        sleep(2000);
        mySelfTab.check();
    }
}