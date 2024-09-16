package US_205_LoginNegative;
import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class TC_0501 extends BaseDriver {
/*  1. Web tarayıcısını açın ve "demowebshop.tricentis.com" adresine gidin.
    2. Anasayfada "Login" butonuna tıklayın.
    3. "Email" ve "Password" alanlarına test data daki bilgileri girin:
    4. "Login" butonuna tıklayarak giriş yapmayı deneyin..
     Geçerli datalar kayıt olunmuş email ve şifredir.
 a) Boş email, boş şifre. b) Geçerli email, boş şifre  c) Boş email, geçerli şifre d) Geçersiz email, geçersiz şifre */
    @Test
    public void Test1()
    {
        driver.get("https://demowebshop.tricentis.com/");
        WebElement login = driver.findElement(By.xpath("//a[@href='/login'][text()='Log in']"));
        login.click();
        MyFunc.Bekle(3);

        WebElement eMail = driver.findElement(By.xpath("//input[@id='Email']"));
        eMail.click();
        eMail.sendKeys("");
        MyFunc.Bekle(3);

        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.click();
        password.sendKeys("");
        MyFunc.Bekle(3);

        WebElement login2 = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        login2.click();
        MyFunc.Bekle(10);

        BekleKapat();
    }
    @Test
    public void Test2() {
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
        password.sendKeys("");
        MyFunc.Bekle(3);

        WebElement login2 = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        login2.click();
        MyFunc.Bekle(10);

        BekleKapat();
    }
    @Test
    public void Test3() {
        driver.get("https://demowebshop.tricentis.com/");
        WebElement login = driver.findElement(By.xpath("//a[@href='/login'][text()='Log in']"));
        login.click();
        MyFunc.Bekle(3);

        WebElement eMail = driver.findElement(By.xpath("//input[@id='Email']"));
        eMail.click();
        eMail.sendKeys("");
        MyFunc.Bekle(3);

        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.click();
        password.sendKeys("12345Sdet*");
        MyFunc.Bekle(3);

        WebElement login2 = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        login2.click();
        MyFunc.Bekle(10);

        BekleKapat();
    }
    @Test
    public void Test4(){
        driver.get("https://demowebshop.tricentis.com/");
        WebElement login = driver.findElement(By.xpath("//a[@href='/login'][text()='Log in']"));
        login.click();
        MyFunc.Bekle(3);

        WebElement eMail = driver.findElement(By.xpath("//input[@id='Email']"));
        eMail.click();
        eMail.sendKeys("sdet_team_105@hotmail.com");
        MyFunc.Bekle(3);

        WebElement password = driver.findElement(By.xpath("//input[@id='Password']"));
        password.click();
        password.sendKeys("12345sdet?");
        MyFunc.Bekle(3);

        WebElement login2 = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        login2.click();
        MyFunc.Bekle(10);

        BekleKapat();

    }


}
