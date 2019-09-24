package ConciseApi;

import com.codeborne.selenide.*;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;


public class TestBase {

    @Before
    public void init() {
        WebDriverManager.chromedriver().setup();
        Configuration.browser = "chrome";
        System.out.println("init completed");
    }


    @After
    public void tearDown() {
        if(WebDriverRunner.getWebDriver()!= null) {
            WebDriverRunner.getWebDriver().quit();
        }

        System.out.println("tearDown completed");
    }
}