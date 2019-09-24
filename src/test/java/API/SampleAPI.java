package API;

import ConciseApi.Api.TestBaseApi;
import org.hamcrest.Matchers;
import org.junit.Test;

import static io.restassured.RestAssured.when;



public class SampleAPI extends TestBaseApi {

    @Test
    public void sample() {

        when().
                get("api/people/1").
                then().
                statusCode(200);



        /*given().
                contentType("application/json").
                accept("application.json").
                body(null).
                when().
                get("/complete/search?q&cp=0&client=psy-ab&xssi=t&gs_ri=gws-wiz&hl=ru&authuser=0&pq=selenide&psi=l5yJXcagOO3IrgSPzpr4Dg.1569299609741&ei=l5yJXcagOO3IrgSPzpr4Dg").
                then().*/

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
