package UiTests;


import ConciseApi.Ui.TestBaseUi;
import org.junit.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selenide.*;

public class SampleTestUi extends TestBaseUi {

    @Test
    public void sample() {
        open("https://www.google.com/");
        $(By.xpath("//img[@alt='День осеннего равноденствия']")).shouldBe(visible);
    }
}