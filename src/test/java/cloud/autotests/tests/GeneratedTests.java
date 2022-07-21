package cloud.autotests.tests;

import cloud.autotests.helpers.DriverUtils;
import io.qameta.allure.Description;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.title;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;


public class GeneratedTests extends TestBase {
    @Test
    @Description("Soon to be implemented by you (or QA.GURU engineers)")
    @DisplayName("Amazon search test")
    void generatedTest() {
        step("Open 'https://www.amazon.com", () -> {
            step("// todo: just add selenium action");
        });

        step("Search for a value 'headphones'\"", () -> {
            step("// todo: just add selenium action");
        });

        step("Choose in filters 'JBL' and '$25 to $50'", () -> {
            step("// todo: just add selenium action");
        });

        step("Sort by Avg. Customer Review", () -> {
            step("// todo: just add selenium action");
        });

        step("Check results 'JBL TUNE 600BTNC - Noise Cancelling On-Ear Wireless Bluetooth Headphone - Pink'", () -> {
            step("// todo: just add selenium action");
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://www.amazon.com'", () ->
            open("https://www.amazon.com"));

        step("Page title should have text 'Amazon.com. Spend less. Smile more.'", () -> {
            String expectedTitle = "Amazon.com. Spend less. Smile more.";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

    @Test
    @Description("Autogenerated test")
    @DisplayName("Page console log should not have errors")
    void consoleShouldNotHaveErrorsTest() {
        step("Open url 'https://www.amazon.com'", () ->
            open("https://www.amazon.com"));

        step("Console logs should not contain text 'SEVERE'", () -> {
            String consoleLogs = DriverUtils.getConsoleLogs();
            String errorText = "SEVERE";

            assertThat(consoleLogs).doesNotContain(errorText);
        });
    }
}