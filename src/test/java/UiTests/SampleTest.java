package UiTests;


import ConciseApi.TestBase;
import com.codeborne.selenide.Configuration;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class SampleTest extends TestBase {

    @Test
    public void sample() {
        open("https://www.google.com/");
        $(By.xpath("//img[@alt='День осеннего равноденствия']")).shouldBe(visible);
    }
}