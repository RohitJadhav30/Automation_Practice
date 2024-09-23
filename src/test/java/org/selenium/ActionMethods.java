package org.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ActionMethods {

    public WebDriver driver;

    @BeforeTest
    public void driver() throws InterruptedException{
        driver = new ChromeDriver();
    }

    @Test
    public void dropable() throws InterruptedException{
        driver.get("https://jqueryui.com/droppable/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.switchTo().frame(0);
        WebElement src = driver.findElement(By.id("draggable"));
        WebElement dst = driver.findElement(By.xpath("//p[text()='Drop here']"));
        Thread.sleep(2000);
        Actions action = new Actions(driver);
        action.dragAndDrop(src,dst).perform();
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void draggable() throws InterruptedException{
        driver.get("https://jqueryui.com/draggable/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.switchTo().frame(0);
        WebElement src = driver.findElement(By.id("draggable"));

        Actions act = new Actions(driver);

        Thread.sleep(2000);
        act.dragAndDropBy(src,230, 88).perform();

        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void doubleClick() throws InterruptedException{
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement target = driver.findElement(By.id("email"));

        Actions action = new Actions(driver);
        action.doubleClick(target).perform();
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void contextClick_Method() throws InterruptedException{
        driver.get("https://www.facebook.com/");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.id("email"));
        Thread.sleep(3000);
        Actions act = new Actions(driver);
        act.contextClick(element).perform();
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void moveToElement_Method() throws InterruptedException{
        driver.get("https://www.giva.co/");
        driver.manage().window().maximize();
        WebElement element = driver.findElement(By.id("HeaderMenu-shop-by-category"));
        Thread.sleep(3000);
        Actions act = new Actions(driver);
        act.moveToElement(element).perform();
        Thread.sleep(3000);
        driver.quit();
    }
}
