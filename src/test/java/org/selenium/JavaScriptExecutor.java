package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class JavaScriptExecutor {
    public WebDriver driver;

    @BeforeTest
    public void driver(){
        driver = new ChromeDriver();
    }

    @Test
    public void edit_disabledfield() throws InterruptedException{
        driver.get("C:\\BridgeLabz\\Quality Kiosk\\Automation_Testing\\Automation_Practice\\src\\test\\java\\org\\selenium\\JavaScriptExecutor.html");

        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        Thread.sleep(2000);

        js.executeScript("document.getElementById('t1').value='Rohit Jadhav' ");
        Thread.sleep(2000);
        js.executeScript("document.getElementById('t2').value='manager' ");
        js.executeScript("document.getElementById('t2').type = 'button'");
    }

    @Test
    public void scrollFunction() throws InterruptedException{
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 1000)");
        Thread.sleep(5000);
        js.executeScript("window.scrollBy(0, -1000)");
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void frame_function() throws InterruptedException{
        driver.get("C:\\BridgeLabz\\Quality Kiosk\\Automation_Testing\\Automation_Practice\\src\\test\\java\\org\\selenium\\Page2.html");
        driver.manage().window().maximize();
        driver.switchTo().frame(0);
        driver.findElement(By.id("1")).sendKeys("Rohit");
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        driver.findElement(By.id("2")).sendKeys("Jadhav");
        Thread.sleep(5000);
        driver.quit();
    }

}
