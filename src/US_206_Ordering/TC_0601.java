package US_206_Ordering;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;


public class TC_0601{
    @Test
    public void Test6()
    {
        WebDriver driver=new ChromeDriver();
//selcuk
        driver.get("https://Demowebshop.tricentis.com/");
        Bekle(2);

        WebElement loginButton=driver.findElement(By.xpath("//a[text()='Log in']"));
        loginButton.click();
        Bekle(2);

        WebElement eMail=driver.findElement(By.id("Email"));
        eMail.sendKeys("sdet_team_105@hotmail.com");

        WebElement password=driver.findElement(By.id("Password"));
        password.sendKeys("12345Sdet*");
        Bekle(3);

        WebElement loginClick=driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        loginClick.click();


        WebElement homePageClick=driver.findElement(By.xpath("//div[@class='header-logo']"));
        homePageClick.click();
        Bekle(3);

        Actions actions=new Actions(driver);
        WebElement computers=driver.findElement(By.xpath("//div[@class='header-menu']/ul/li[2]"));
        WebElement notebook=driver.findElement(By.xpath("//div[@class='header-menu']/ul/li/ul/li[2]"));
        actions.moveToElement(computers).build().perform();
        actions.click(notebook).build().perform();
        Bekle(3);

        WebElement addToCart=driver.findElement(By.xpath("//input[@value='Add to cart']"));
        addToCart.click();

        WebElement shoppingCart=driver.findElement(By.xpath("//span[text()='Shopping cart']"));
        shoppingCart.click();
        Bekle(3);

        WebElement countryMenu=driver.findElement(By.id("CountryId"));
        Select select=new Select(countryMenu);
        select.selectByVisibleText("Turkey");
        Bekle(1);

        WebElement acceptCondition=driver.findElement(By.id("termsofservice"));
        acceptCondition.click();
        Bekle(1);

        WebElement checout=driver.findElement(By.id("checkout"));
        checout.click();
        Bekle(3);

        WebElement countryMenu2=driver.findElement(By.id("BillingNewAddress_CountryId"));
        Select select1=new Select(countryMenu2);
        select1.selectByVisibleText("Turkey");
        Bekle(3);

        WebElement city=driver.findElement(By.id("BillingNewAddress_City"));
        city.sendKeys("İSTANBUL");

        WebElement adress1=driver.findElement(By.id("BillingNewAddress_Address1"));
        adress1.sendKeys("ADRES SATIRI 1");

        WebElement zipCode=driver.findElement(By.id("BillingNewAddress_ZipPostalCode"));
        zipCode.sendKeys("00001");

        WebElement phoneNumber=driver.findElement(By.id("BillingNewAddress_PhoneNumber"));
        phoneNumber.sendKeys("0500000000");
        Bekle(3);

        WebElement continueBillingAdress=driver.findElement(By.xpath("//input[@onclick='Billing.save()']"));
        continueBillingAdress.click();
        Bekle(2);


        WebElement ShippingAdressPickUp=driver.findElement(By.xpath("//label[text()='In-Store Pickup']"));
        ShippingAdressPickUp.click();
        Bekle(1);
        WebElement ShippingAdressContinue=driver.findElement(By.xpath("//input[@onclick='Shipping.save()']"));
        ShippingAdressContinue.click();
        Bekle(2);

        WebElement creditCardSelect=driver.findElement(By.id("paymentmethod_2"));
        creditCardSelect.click();
        WebElement paymentContinue=driver.findElement(By.xpath("//input[@onclick='PaymentMethod.save()']"));
        paymentContinue.click();
        Bekle(2);

        WebElement cardTypeMenu=driver.findElement(By.id("CreditCardType"));
        Select creditSelect=new Select(cardTypeMenu);
        creditSelect.selectByVisibleText("Master card");

        WebElement cardholderName=driver.findElement(By.id("CardholderName"));
        cardholderName.sendKeys("Team10 Selenium2");

        WebElement cardNumber=driver.findElement(By.id("CardNumber"));
        cardNumber.sendKeys("4938 4101 9256 6990");

        WebElement monthMenu=driver.findElement(By.id("ExpireMonth"));
        Select cardMonth=new Select(monthMenu);
        cardMonth.selectByVisibleText("08");

        WebElement yearMenu=driver.findElement(By.id("ExpireYear"));
        Select cardYear=new Select(yearMenu);
        cardYear.selectByVisibleText("2031");

        WebElement cardCode=driver.findElement(By.id("CardCode"));
        cardCode.sendKeys("539");

        WebElement paymentInfoContinue=driver.findElement(By.xpath("//input[@onclick='PaymentInfo.save()']"));
        paymentInfoContinue.click();
        Bekle(2);

        WebElement productSubtotal=driver.findElement(By.xpath("//span[@class='product-subtotal']"));
        WebElement total=driver.findElement(By.xpath("//span[@class='product-price order-total']"));

        Assert.assertTrue("Hesaplanan fiyat yanlış",productSubtotal.getText().equalsIgnoreCase(total.getText()));
        Bekle(2);

        WebElement confirmButton=driver.findElement(By.xpath("//input[@onclick='ConfirmOrder.save()']"));
        confirmButton.click();
        Bekle(1);

        WebElement completedText=driver.findElement(By.xpath("//div[@class='section order-completed']/div"));
        Assert.assertTrue("Sipariş hatası",completedText.getText().equalsIgnoreCase("Your order has been successfully processed!"));

        WebElement orderNumber=driver.findElement(By.xpath("//ul[@class='details']"));
        Assert.assertTrue("Sipariş numarası oluşturulmadı",!(orderNumber.getText().isEmpty()));


        driver.quit();




    }

    public static void Bekle(int sn) {

        try {
            Thread.sleep(sn*1000);
        }catch (InterruptedException e){
            throw  new RuntimeException(e);
        }
    }
}
