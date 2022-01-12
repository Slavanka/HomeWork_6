package github.qaguru.allure;

import io.qameta.allure.*;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static org.openqa.selenium.By.linkText;
import static org.openqa.selenium.By.partialLinkText;

public class StepLambdaTest {
    public static final String REPOSITORY = "Slavanka/HomeWork_6";

    @Test
    @Owner("Slavanka")
    @Feature("Issues")
    @Story("Проверка наличия вкладки Issues")
    @DisplayName("Проверка наличия вкладки Issues с лямбда шагами")
    @Severity(SeverityLevel.BLOCKER)
    @Link(value = "GitHub", url = "https://github.com")

    public void testGithub() {
        step("Открываем главную страницу", () -> {
            open("https://github.com");
        });

        step("Ищем репозиторий " + REPOSITORY, () -> {
            $(".header-search-input").click();
            $(".header-search-input").sendKeys(REPOSITORY);
            $(".header-search-input").submit();
        });

        step("Переходим в репозиторий " + REPOSITORY, () -> {
            $(linkText(REPOSITORY)).click();

        });

        step("Открываем таб Issues", () -> {
            $(partialLinkText("Issues")).click();
        });
    }
}
