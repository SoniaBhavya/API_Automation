import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import static io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

public class Day1 {

    @Test
    public void get() {
        given().get("https://reqres.in/api/users?page2")
                .then().statusCode(200).log().all() ;
    }
}
