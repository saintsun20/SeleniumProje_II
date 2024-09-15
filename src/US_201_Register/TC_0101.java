package US_201_Register;
import Utility.MyFunc;
import org.junit.Test;
import Utility.BaseDriver;
import com.google.common.annotations.VisibleForTesting;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_0101 extends BaseDriver {
/*
    1. Web tarayıcısını açın ve "https://demowebshop.tricentis.com/" adresine gidin.
    2. Anasayfada "Register" butonuna tıklayın.
    3. "Your Personal Details" bölümünde test datada verilen bilgileri doldurun:
    "Register" butonuna tıklayarak kayıt işlemi gerçekleştirin.     */
    @Test
    public void Test1()
    {
        driver.get("https://demowebshop.tricentis.com/");    // demowebshop sitesine gidildi

        WebElement register = driver.findElement(By.xpath("//a[@href='/register'][text()='Register']"));
        // register butonu bulundu
        register.click(); // register butonuna tıklandı

        WebElement male = driver.findElement(By.xpath("//input[@id='gender-male']"));
        male.click();
        MyFunc.Bekle(10);

        WebElement firstName = driver.findElement(By.xpath("//input[@id='FirstName']"));
        firstName.click();
        firstName.sendKeys("TeamTen");
        MyFunc.Bekle(5);

        WebElement lastName = driver.findElement(By.xpath("//INPUT[@id='LastName']"));
        lastName.click();
        lastName.sendKeys("TeamTenTogether");
        MyFunc.Bekle(3);

        WebElement eMail = driver.findElement(By.xpath("//INPUT[@id='Email']"));
        eMail.click();
        eMail.sendKeys("sdet_team_105@hotmail.com");
        MyFunc.Bekle(3);

        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.click();
        password.sendKeys("12345Sdet*");
        MyFunc.Bekle(3);

        WebElement password2 = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        password2.click();
        password2.sendKeys("12345Sdet*");
        MyFunc.Bekle(3);

        WebElement register2 = driver.findElement(By.xpath("//INPUT[@id='register-button']"));
        register2.click();
        MyFunc.Bekle(10);

        BekleKapat();

    }
}
