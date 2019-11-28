import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.*;

public final class GoogleTest {

    @Test
    public void findInGoogle() {
        open("http://google.com");
        $(By.name("q")).setValue("Selenide").pressEnter();
        $(By.className("S3Uucc")).shouldHave(text("Selenide: лаконичные и стабильные UI тесты на Java"));
    }
}
