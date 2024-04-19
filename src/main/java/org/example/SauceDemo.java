package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

public class SauceDemo {
    WebDriver driver;


    public SauceDemo(WebDriver driver){
        this.driver=driver;
        driver.manage().timeouts().implicitlyWait(15000, TimeUnit.MILLISECONDS);
    }
        //login page
    private final By uid=By.xpath("//input[@id='user-name']");
    private final By pid=By.xpath("//input[@id='password']");
    private final By btn=By.xpath("//input[@id='login-button']");

    public void setLogin() throws InterruptedException{
        WebElement r=driver.findElement(uid);
        r.sendKeys("standard_user");

        WebElement s=driver.findElement(pid);
        s.sendKeys("secret_sauce");

        driver.findElement(btn).click();

    }

        // product page
    private final By filter_items=By.cssSelector(".product_sort_container");
    private final By ZtoA=By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select/option[2]");

    public void setFilter() throws InterruptedException{

        WebElement fi=driver.findElement(filter_items);
        fi.click();
        driver.findElement(ZtoA).click();
    }

        //cart page
    private final By slctd_item1=By.name("add-to-cart-test.allthethings()-t-shirt-(red)");
    private  final By slctd_item2=By.name("add-to-cart-sauce-labs-onesie");
    private final By add2cart=By.cssSelector(".shopping_cart_link");

    public void setCart()throws InterruptedException{
        driver.findElement(slctd_item1).click();
       // Thread.sleep(2000);
        driver.findElement(slctd_item2).click();
        //Thread.sleep(2000);
        driver.findElement(add2cart).click();
    }
        //shipping details
    private final By checkout=By.name("checkout");
    private final By Fname_info=By.id("first-name");
    private final By Lname_info=By.id("last-name");
    private final By postal=By.id("postal-code");
    private final By cnt=By.name("continue");

    public void setCheckout() throws InterruptedException{
        driver.findElement(checkout).click();
        driver.findElement(Fname_info).sendKeys("Firstname");
       // Thread.sleep(2000);
        driver.findElement(Lname_info).sendKeys("Lastname");
       // Thread.sleep(2000);
        driver.findElement(postal).sendKeys("4332");
       // Thread.sleep(1000);
        driver.findElement(cnt).click();
    }
        // finish btn
    private final By finish=By.id("finish");
    public void setFinish()throws InterruptedException{
        driver.findElement(finish).click();
    }
}