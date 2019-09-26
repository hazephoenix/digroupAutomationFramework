package API;

import ConciseApi.Api.TestBaseApi;
import io.restassured.response.Response;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.when;



public class SampleAPI extends TestBaseApi {

    @Test
    public void sample() {
        Response resp = when().
                get("api/people/1").
                then().extract().response();


    }

    @Test
    public void sample2() {


        when().get("http://swapi.co/api/people/1/")
                .then().statusCode(200)
                .and()
                .assertThat()
                .body("name", Matchers.equalTo("Lukj Skywalker"));
    }

}
