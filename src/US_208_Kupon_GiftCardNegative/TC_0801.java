package US_208_Kupon_GiftCardNegative;

import Utility.BaseDriver;
import Utility.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TC_0801 extends BaseDriver {
/*
1. Web tarayıcısını açın ve "demowebshop.tricentis.com" adresine gidin.
 2. Eğer kullanıcı oturumu açık değilse, oturum açın (giriş yapın).
 3. Anasayfada "Computers" menüsünden "Notebook"altındaki "14.1-inch Laptop" ürününe tıklayın.
 4. Ürün sayfasında "Add to Cart" (Sepete Ekle) düğmesine tıklayarak ürünü sepete ekleyin.
 5. Sepetinize gitmek için "Shopping Cart" (Alışveriş Sepeti) düğmesine tıklayın.
 6. "Apply Coupon" (Kupon Kullan) düğmesine tıklayın (kupon kodu yoksa kod girmeden tıklayın).
 7. Kullanılacak kupon kodu olmadığını doğrulayın.
 8. "Add Gift Card" (Hediye Kartı Ekle) düğmesine tıklayın (hediye kartı kodu yoksa kod girmeden tıklayın).
 9. Kullanılacak gift card (hediye kart kodu) olmadığını doğrulayın.
 10. Kargo detayları için gerekli bilgileri doldurun:
 11. Ülke ve Eyalet seçin.
 12. Şartları kabul edin.
 13. "Checkout" (Ödeme) düğmesine tıklayarak ödeme sayfasına gidin.
 14. Ödeme bilgilerini doldurun ve siparişi onaylayın.
 15 "Your order has been successfully processed!" (Siparişiniz başarıyla işleme alındı) mesajının görüntülendiğini doğrulayın. */
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

        WebElement applyCupon = driver.findElement(By.xpath("(//input[@type='submit'])[4]"));
        applyCupon.click();
        MyFunc.Bekle(10);

        WebElement addGiftCard = driver.findElement(By.xpath("(//input[@type='submit'])[5]"));
        addGiftCard.click();
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
        accept.click();         MyFunc.Bekle(3);

        WebElement checkOut = driver.findElement(By.xpath("//button[@id='checkout']"));
        checkOut.click();       MyFunc.Bekle(3);

        WebElement continue1 = driver.findElement(By.xpath("(//input[@type='button'])[2]"));
        continue1.click();      MyFunc.Bekle(3);

        WebElement tikla = driver.findElement(By.xpath("//input[@id='PickUpInStore']"));
        tikla.click();          MyFunc.Bekle(3);

        WebElement continue2 =driver.findElement(By.xpath("(//input[@type='button'])[3]"));
        continue2.click();      MyFunc.Bekle(3);

        WebElement creditCard = driver.findElement(By.xpath("//input[@id='paymentmethod_2']"));
        creditCard.click();     MyFunc.Bekle(3);

        WebElement continue3 = driver.findElement(By.xpath("(//INPUT[@type='button'])[5]"));
        continue3.click();      MyFunc.Bekle(3);

        WebElement visaCard = driver.findElement(By.xpath("//option[@value='Visa']"));
        visaCard.click();

        WebElement cardHolderName = driver.findElement(By.xpath("//input[@name='CardholderName']"));
        cardHolderName.click();
        cardHolderName.sendKeys("Team Ten");

        WebElement cardNumber = driver.findElement(By.xpath("//input[@name='CardNumber']"));
        cardNumber.click();
        cardNumber.sendKeys("4242 4242 4242 4242");     MyFunc.Bekle(2);

        WebElement cardMonth = driver.findElement(By.xpath("(//option[@value='1'])[3]"));
        cardMonth.click();      MyFunc.Bekle(2);

        WebElement cardYear = driver.findElement(By.xpath("//option[@value='2032']"));
        cardYear.click();       MyFunc.Bekle(2);

        WebElement cvCode = driver.findElement(By.xpath("//input[@name='CardCode']"));
        cvCode.click();         MyFunc.Bekle(2);
        cvCode.sendKeys("123");

        WebElement continue4 = driver.findElement(By.xpath("(//input[@type='button'])[6]"));
        continue4.click();      MyFunc.Bekle(2);

        WebElement confirm = driver.findElement(By.xpath("(//input[@type='button'])[7]"));
        confirm.click();        MyFunc.Bekle(3);

        WebElement continue5 =driver.findElement(By.xpath("//input[@type='button']"));
        continue5.click();      MyFunc.Bekle(2);

        BekleKapat();


    }
}
