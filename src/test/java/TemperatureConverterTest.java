import com.utils.TemperatureConverter;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TemperatureConverterTest {

    private final double  celsius = 12.54;
    private final double  kelvin = 285.69;

    @Test
    public void kelvinToCelsiusConverter(){
        double actual = TemperatureConverter.kelvinToCelsius(kelvin);
        Assert.assertEquals(actual, celsius);
    }

    @Test
    public void celsiusToKelvinConverter(){
        double actual = TemperatureConverter.celsiusToKelvin(celsius);
        Assert.assertEquals(actual, kelvin);
    }
}
