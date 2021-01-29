import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;
import static com.codeborne.selenide.WebDriverRunner.setWebDriver;

public class LocatTests {

    @Test
    public void openMainPage() {

        Configuration.startMaximized = true;
        Configuration.browser = "chrome";
        WebDriver driver = getWebDriver();
        ChromeOptions options = new ChromeOptions();
        options.addArguments(“lang=ru”);

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(ChromeOptions.CAPABILITY, options);

        setWebDriver(driver);


        open("https://aliradar.com/");



    }

}
