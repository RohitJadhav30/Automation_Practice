package org.selenium;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import java.awt.*;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;

public class Automation_Practice {
    public WebDriver driver;
    @Test
    public void take_Screenshot() throws InterruptedException, IOException {
        driver = new ChromeDriver();
        driver.get("https://www.giva.co/");
        driver.manage().window().maximize();
        TakesScreenshot ts = (TakesScreenshot) driver;
        File file = ts.getScreenshotAs(OutputType.FILE);
        File dfile = new File("C:\\BridgeLabz\\Quality Kiosk\\Automation_Testing\\" + "giva.png");
        FileHandler.copy(file, dfile);
    }

    @Test
    public void tripAdvisor_login() throws InterruptedException{
        driver = new ChromeDriver();
        driver.get("https://www.tripadvisor.in/");
        driver.manage().window().maximize();
        //Thread.sleep(10000);
    }

    @Test
    public void spiceJet() throws InterruptedException{
        driver.get("https://www.spicejet.com/");
        driver.manage().window().maximize();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//div[text()='From']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[text()='Chhatrapati Shivaji Maharaj International Airport']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[text()='HYD']")).click();

    }

    @Test
    public void robot_actions() throws InterruptedException, AWTException {
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Robot robo = new Robot();

        robo.keyPress(KeyEvent.VK_SHIFT);
        robo.keyPress(KeyEvent.VK_R);
        robo.keyRelease(KeyEvent.VK_R);

        Thread.sleep(1000);
        robo.keyPress(KeyEvent.VK_O);
        robo.keyRelease(KeyEvent.VK_O);

        Thread.sleep(1000);
        robo.keyPress(KeyEvent.VK_H);
        robo.keyRelease(KeyEvent.VK_H);

        Thread.sleep(1000);
        robo.keyPress(KeyEvent.VK_I);
        robo.keyRelease(KeyEvent.VK_I);

        Thread.sleep(1000);
        robo.keyPress(KeyEvent.VK_T);
        robo.keyRelease(KeyEvent.VK_T);

        robo.keyRelease(KeyEvent.VK_SHIFT);

        //Select
        robo.keyPress(KeyEvent.VK_CONTROL);
        robo.keyPress(KeyEvent.VK_A);
        robo.keyRelease(KeyEvent.VK_CONTROL);
        robo.keyRelease(KeyEvent.VK_A);

        //Copy
        robo.keyPress(KeyEvent.VK_CONTROL);
        robo.keyPress(KeyEvent.VK_C);
        robo.keyRelease(KeyEvent.VK_CONTROL);
        robo.keyRelease(KeyEvent.VK_C);

        //Paste
        robo.keyPress(KeyEvent.VK_TAB);
        robo.keyPress(KeyEvent.VK_CONTROL);
        robo.keyPress(KeyEvent.VK_V);
        robo.keyRelease(KeyEvent.VK_CONTROL);
        robo.keyRelease(KeyEvent.VK_V);

        Thread.sleep(5000);
        driver.quit();
    }
}
