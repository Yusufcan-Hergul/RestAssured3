import org.testng.annotations.Test;


import static io.restassured.RestAssured.given;
import static org.hamcrest.Matchers.*;

public class ZippoTest {

    @Test
    public void statusCodeTest(){

        given()



                .when()
                .get("http://api.zippopotam.us/us/90210")

                .then()
                .log()
                .body()
                .statusCode(200);


    }


}
