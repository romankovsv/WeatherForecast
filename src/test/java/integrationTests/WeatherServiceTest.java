package integrationTests;

import com.utils.TemperatureConverter;
import com.weather.WeatherDetails;
import com.weather.WeatherService;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WeatherServiceTest {

    private String city = "London";
    private String region = "uk";
    private double temperature = 280.0;

    @Test
    public void testWeatherService(){
        WeatherService service = new WeatherService(Mock.createMock(city,region, temperature));
        Assert.assertNotNull(service);
        WeatherDetails details = service.getWeather(city, region);

        Assert.assertNotNull(details);
        Assert.assertEquals(details.getCity(), city);

        double actual = details.getStatus().getTemperature();
        Assert.assertEquals(actual, TemperatureConverter.kelvinToCelsius(temperature));
    }
}
