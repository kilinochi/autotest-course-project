import com.kilinochi.page.holiday.HolidayPage;
import com.kilinochi.page.holiday.HolidayTab;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public final class CreateHolidayTest extends BaseTest {
    private static final String test =  "День подарков";
    @Test
    public void createWork() {

        final HolidayPage holidayPage = userPage.holidayPage();
        final HolidayTab holidayTab = holidayPage.addHoliday();
        holidayTab.findHoliday(test);
        sleep(1000);
        refresh();

        final String str =  "//div[contains(text(),'" +test+"')]";
        final By OK_LOCATOR = By.xpath(str);
        sleep(2000);
        Assert.assertTrue("Error ADD HOLIDAY",$(OK_LOCATOR).exists());
    }
}

