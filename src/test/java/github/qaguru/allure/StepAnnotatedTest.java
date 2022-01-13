package github.qaguru.allure;

import github.qaguru.allure.steps.WebSteps;
import org.junit.jupiter.api.Test;

public class StepAnnotatedTest {
   private static final String REPOSITORY = "Slavanka/HomeWork_6";

    private WebSteps steps = new WebSteps();

    @Test
    public void testGithub() {
        steps.openMainPage();
        steps.searchForRepository(REPOSITORY);
        steps.openRepositoryPage(REPOSITORY);
        steps.openIssuesTab();

    }

}

