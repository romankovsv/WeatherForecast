import com.utils.TemperatureFormatter;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TemperatureFormatterTest {
    private  final String DEGREE  = "\u00b0";
    private  final String expectedResult = "+2"+DEGREE+"C";
    private  final double temperature = 2;
    private  final String measure  = DEGREE+"C";

    @Test
    public void temperatureFormatterTest(){
        String actual = TemperatureFormatter.format(temperature,measure);
        Assert.assertEquals(actual,expectedResult);
    }
}
