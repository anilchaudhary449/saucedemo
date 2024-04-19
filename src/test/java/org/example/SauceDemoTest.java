package org.example;
import com.browser.Browser;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SauceDemoTest {

    WebDriver driver = Browser.setupBrowser("chrome", "https://saucedemo.com/");
    SauceDemo sauceDemo;

    @Test(priority = 1)
    public void getLogin() throws InterruptedException {

        sauceDemo = new SauceDemo(driver);
        sauceDemo.setLogin();
        Thread.sleep(3000);

    }

    @Test(priority = 2)
    public void getFilter() throws InterruptedException{

        sauceDemo.setFilter();
        Thread.sleep(5000);
    }

    @Test(priority = 3)
    public void getCart()throws InterruptedException{

        sauceDemo.setCart();
        Thread.sleep(5000);

    }
    @Test(priority = 4)
    public void getCheckout()throws InterruptedException{
        sauceDemo.setCheckout();
        Thread.sleep(2000);

    }
    @Test(priority = 5)
    public void getFinish()throws InterruptedException{
        sauceDemo.setFinish();
        driver.quit();
    }
    }