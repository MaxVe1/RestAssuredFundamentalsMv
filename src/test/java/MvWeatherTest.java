
import org.junit.Test;

import static io.restassured.RestAssured.*;

public class MvWeatherTest {

    @Test
    public void MvWeatherTest() {
        given()
                .log().all().
        when().get("https://api.openweathermap.org/data/2.5/weather?id=756135&appid=9ddd6302baf46ddfa9ba23ea6980f08c").
        then().
                log().all();
    }

}
