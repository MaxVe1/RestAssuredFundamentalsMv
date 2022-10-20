package config;

import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.filter.log.RequestLoggingFilter;
import io.restassured.filter.log.ResponseLoggingFilter;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;
import org.junit.BeforeClass;

import static org.hamcrest.Matchers.lessThan;

public class WeatherPlusConfig {

    public static RequestSpecification mvWeather_requestSpec;
    public static ResponseSpecification mvWeather_responseSpec;

    @BeforeClass
    public static void setup() {

        mvWeather_requestSpec = new RequestSpecBuilder()
                .setBaseUri("https://api.openweathermap.org/")
                .setBasePath("data/2.5/")

                //.addFilter(new RequestLoggingFilter())
                //.addFilter(new ResponseLoggingFilter())
                .build();

        mvWeather_responseSpec = new ResponseSpecBuilder()
                .expectStatusCode(200)
                .expectResponseTime(lessThan(3000L))
                .build();

        RestAssured.requestSpecification = mvWeather_requestSpec;
        RestAssured.responseSpecification = mvWeather_responseSpec;

    }
}



//.setPort(8080)
// .addHeader("Content-Type", "application/json")
//.addHeader("Accept", "application/json")
