import org.junit.Test;
import config.WeatherPlusConfig;

import static io.restassured.RestAssured.*;

public class WeatherPlus extends WeatherPlusConfig {

    @Test
    public void weatherPlus() {
        given()
                .log().all().
        when().get("weather?id=756135&appid=9ddd6302baf46ddfa9ba23ea6980f08c").
        then().
                log().all();
    }

}
