package US_203_Logout;
import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.devtools.v126.page.model.WebAppManifest;
public class TC_0301 extends BaseDriver {
/*  1. Web tarayıcısını açın ve "demowebshop.tricentis.com"  adresine gidin.
    2. Anasayfada kullanıcı oturumu açın (giriş yapın).
    3. Oturum açıldığında, kullanıcı adınızın göründüğünü doğrulayın.
    4. Kullanıcı adınızın yanındaki "Logout" veya "Çıkış" bağlantısına tıklayarak oturumu kapatın.
    5. ÇIkış yapıldığını doğrulayın.       */
    @Test
    public void Test1()
    {   driver.get("https://demowebshop.tricentis.com/");
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

        WebElement kullaniciAdi = driver.findElement(By.xpath("//a[@href='/customer/info']" +
                "[text()='sdet_team_10@hotmail.com']"));
        Assert.assertTrue("Kullanıcı Adına Rastlanamadı!",kullaniciAdi.getText().contains("sdet_team"));
        MyFunc.Bekle(5);

        WebElement logout = driver.findElement(By.xpath("//a[@href='/logout'][text()='Log out']"));
        logout.click();
        MyFunc.Bekle(3);

        WebElement loginMi = driver.findElement(By.xpath("//a[@href='/login'][text()='Log in']"));
        Assert.assertTrue("Çıkış Yapılamadı!",loginMi.getText().contains("Log in"));
        MyFunc.Bekle(3);

        BekleKapat();
    }   }
