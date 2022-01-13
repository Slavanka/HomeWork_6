package github.qaguru.allure;

import com.codeborne.selenide.logevents.SelenideLogger;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;


public class SelenideListenerTest {

    @Test
    public void testGithub() {
        // Подключение Листенера Allure
        SelenideLogger.addListener("allure", new AllureSelenide());
        open("https://github.com");

        $(".header-search-input").click();
        $(".header-search-input").sendKeys("Slavanka/HomeWork_6");
        $(".header-search-input").submit();

        $(linkText("Slavanka/HomeWork_6")).click();
        $(partialLinkText("Issues")).click();

    }
}
