package Utility;
import  org.openqa.selenium.WebDriver;
import  org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class BaseDriver {

    public static WebDriver driver;
    // Bunun şartı extends olması ve başta yer alması

    static // tearStart()
    {
        driver = new ChromeDriver();

        driver.manage().window().maximize();  //ekranı maximum yapıyor
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }

    public static void BekleKapat()
    {
        MyFunc.Bekle(3);
        driver.quit();
    }

}
