package US_209_FaturaGoruntuleme;
import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TC_0901 extends BaseDriver {
/*  1) Web tarayıcısını açın ve "demowebshop.tricentis.com" adresine gidin.-
    2 Eğer kullanıcı oturumu açık değilse, oturum açın (giriş yapın).
    3) Anasayfada kullanıcı adınıza veya e-posta adresinize tıklayarak "My Account" (Hesabım) sayfasına gidin.
    4) "Orders" (Siparişler) linkine tıklayarak siparişlerinizi görüntüleyin.
    5) Görüntülemek istediğiniz siparişin (ya da enson siparişin) "Details" (Detaylar) linkine tıklayın.
    6) PDF Invoice linkine tıklayarak faturayı indirin ve görüntüleyin.    */
    @Test   public void Test1() {
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

        WebElement myAccount = driver.findElement(By.xpath("//a[@href='/customer/info'][text()='sdet_team_10@hotmail.com']"));
        myAccount.click();          MyFunc.Bekle(2);

        WebElement orders = driver.findElement(By.xpath("(//a[@href='/customer/orders'][text()='Orders'])[1]"));
        orders.click();             MyFunc.Bekle(10);

        WebElement detailss = driver.findElement(By.xpath("(//input[@type='button'])[1]"));
        MyFunc.Bekle(3);
        detailss.click();            MyFunc.Bekle(5);

        WebElement pdfInvoce = driver.findElement(By.xpath("//a[@href='/orderdetails/pdf/1791064'][text()='PDF Invoice']"));
        pdfInvoce.click();          MyFunc.Bekle(2);

        WebElement print = driver.findElement(By.xpath("//a[@href='/orderdetails/print/1791064'][text()='Print']"));
        print.click();              MyFunc.Bekle(2);

        BekleKapat();

    }
}
