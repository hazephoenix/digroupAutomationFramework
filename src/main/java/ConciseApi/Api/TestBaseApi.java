package ConciseApi.Api;

import io.restassured.RestAssured;
import org.junit.Before;

public class TestBaseApi {



    @Before
    public void setup() {
        RestAssured.baseURI = "https://swapi.co/";
    }

}
