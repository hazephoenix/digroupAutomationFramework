package ConciseApi;

import com.codeborne.selenide.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

public class TestBase {



    @BeforeEach
    public void init() {
        Configuration.baseUrl = "127.0.0.1";
        System.out.println("init compl;fl   eted");
    }


    @AfterEach
    public void tearDown() {
        System.out.println("tearDown completed");

    }
}