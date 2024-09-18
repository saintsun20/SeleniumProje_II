package US_207_AnketYanitlama;
import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class TC_0701 extends BaseDriver {
/*  1. Web tarayıcısını açın ve "demowebshop.tricentis.com" adresine gidin.
    2. Eğer kullanıcı oturumu açık değilse, oturum açın (giriş yapın).
    3. Anasayfada "Do you like nopCommerce?" sorusuna yanıtlayın.
    4. Oylama için "Excellent" (Mükemmel) seçeneğini seçin.
    5. Oy vermek için ilgili düğmeye tıklayın.    */
    @Test public void Test1() {
        driver.get("https://demowebshop.tricentis.com/");
        WebElement login = driver.findElement(By.xpath("//a[@href='/login'][text()='Log in']"));
        login.click();
        MyFunc.Bekle(3);

        WebElement eMail = driver.findElement(By.xpath("//input[@id='Email']"));
        eMail.click();
        eMail.sendKeys("sdet_team_10@hotmail.com");
        MyFunc.Bekle(3);

        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.click();
        password.sendKeys("12345Sdet*");
        MyFunc.Bekle(3);

        WebElement login2 = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        login2.click();
        MyFunc.Bekle(3);

        WebElement excellent = driver.findElement(By.xpath("//input[@id='pollanswers-1']"));
        excellent.click();
        MyFunc.Bekle(3);

        WebElement vote = driver.findElement(By.xpath("//input[@id='vote-poll-1']"));
        vote.click();
        MyFunc.Bekle(10);

        BekleKapat();

    }
}
