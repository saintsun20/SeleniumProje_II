package US_206_Sipariş_Order;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TC_0601 extends BaseDriver {
/*  1. Web tarayıcısını açın ve "demowebshop.tricentis.com" adresine gidin.
 2. Eğer kullanıcı oturumu açık değilse, oturum açın (giriş altındaki "14.1-inch Laptop" ürününe tıklayın.
 4. Ürün sayfasında "Add to Cart" (Sepete Ekle) düğmesine tıklayarak ürünü sepete ekleyin.
 5. Sepetinize gitmek için "Shopping Cart" (Alışveriş Sepeti) düğmesine tıklayın.
 6. Kargo detayları için gerekli bilgileri doldurun:
 7. Ülke ve Eyalet seçin.
 8. Şartları kabul edin.
 9. "Checkout" (Ödeme) düğmesine tıklayarak ödeme sayfasına gidin.
 10. Ödeme bilgilerini doldurun ve siparişi onaylayın.
 11. "Siparişiniz başarıyla işleme alındı" ("Your order has been successfully processed!" ) mesajının görüntülendiğini doğrulayın.
 12. Sipariş numarasının ana sayfadaki Orders linkinde de var olduğunu doğrulayın. [mesela : Order #1499948]. */
    @Test
    public void Test1() {
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
        MyFunc.Bekle(10);

        WebElement computers = driver.findElement(By.xpath("(//A[@href='/computers'][text()='Computers\n" +
                "        '])[1]"));
        Actions hareket = new Actions(driver);
        hareket.moveToElement(computers).perform();
        MyFunc.Bekle(3);

        WebElement notebooks =driver.findElement(By.xpath("(//A[@href='/notebooks'][text()='Notebooks\n" +
                "        '])[1]"));
        notebooks.click();
        MyFunc.Bekle(3);

        WebElement laptop = driver.findElement(By.xpath("//*[@class='product-title']"));
        laptop.click();
        MyFunc.Bekle(3);

        WebElement addtoCart = driver.findElement(By.xpath("//input[@id='add-to-cart-button-31']"));
        addtoCart.click();
        MyFunc.Bekle(3);

        WebElement shoppingCart = driver.findElement(By.xpath("//span[@class='cart-label'][text()='Shopping cart']"));
        shoppingCart.click();
        MyFunc.Bekle(3);

        WebElement country = driver.findElement(By.xpath("//SELECT[@id='CountryId']"));
        country.click();
        Select secilenCountry = new Select(country);
        secilenCountry.selectByValue("1");
        MyFunc.Bekle(3);

        WebElement state = driver.findElement(By.xpath("//SELECT[@id='StateProvinceId']"));
        state.click();
        Select secilenState = new Select(state);
        secilenState.selectByValue("24");
        MyFunc.Bekle(3);

        WebElement postaKodu = driver.findElement(By.xpath("//INPUT[@id='ZipPostalCode']"));
        postaKodu.click();
        postaKodu.sendKeys("41048");
        MyFunc.Bekle(3);

        WebElement accept = driver.findElement(By.xpath("//input[@id='termsofservice']"));
        accept.click();                                 MyFunc.Bekle(3);

        WebElement checkOut = driver.findElement(By.xpath("//button[@id='checkout']"));
        checkOut.click();                               MyFunc.Bekle(3);

        WebElement continue1 = driver.findElement(By.xpath("(//INPUT[@type='button'])[2]"));
        continue1.click();

        WebElement pickUp = driver.findElement(By.xpath("//INPUT[@id='PickUpInStore']"));
        pickUp.click();

        WebElement continue2 = driver.findElement(By.xpath("(//INPUT[@type='button'])[3]"));
        continue2.click();

        WebElement creditCard = driver.findElement(By.xpath("(//label[@for='paymentmethod_2'])[2]"));
        creditCard.click();

        WebElement continue3 = driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']"));
        continue3.click();

        WebElement visaCard = driver.findElement(By.xpath("//option[@value='Visa']"));
        visaCard.click();

        WebElement cardHolderName = driver.findElement(By.xpath("//input[@name='CardholderName']"));
        cardHolderName.click();
        cardHolderName.sendKeys("Team Ten");

        WebElement cardNumber = driver.findElement(By.xpath("//input[@name='CardNumber']"));
        cardNumber.click();
        cardNumber.sendKeys("4242 4242 4242 4242");

        WebElement cardMonth = driver.findElement(By.xpath("(//option[@value='1'])[3]"));
        cardMonth.click();

        WebElement cardYear = driver.findElement(By.xpath("//option[@value='2032']"));
        cardYear.click();

        WebElement cvCode = driver.findElement(By.xpath("//input[@name='CardCode']"));
        cvCode.click();
        cvCode.sendKeys("123");

        WebElement continue4 = driver.findElement(By.xpath("(//input[@type='button'])[6]"));
        continue4.click();

        WebElement confirm = driver.findElement(By.xpath("(//input[@type='button'])[7]"));
        confirm.click();

        WebElement continue5 = driver.findElement(By.xpath("(//*[@class='button-2 order-completed-continue-button'])"));
        continue5.click();

        BekleKapat();
    }
}
