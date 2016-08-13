package integrationTests;

import com.rest.OpenWeatherClient;
import com.weather.WeatherDetails;
import com.weather.WeatherStatus;
import org.mockito.Mockito;

public class Mock{
    public static  OpenWeatherClient createMock(String city, String region,double temperature) {

        WeatherStatus status = new WeatherStatus();
        status.setTemperature(temperature);
        WeatherDetails details = new WeatherDetails();
        details.setCity(city);
        details.setStatus(status);

        OpenWeatherClient client = Mockito.mock(OpenWeatherClient.class);
        String query = String.format("%s%s", city, region);
        Mockito.when(client.getWeather(query)).thenReturn(details);

        return client;
    }
}
