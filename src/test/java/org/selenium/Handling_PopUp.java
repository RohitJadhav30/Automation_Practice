package org.selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.IOException;

public class Handling_PopUp {
    public WebDriver driver;

    @BeforeTest
    public void setDriver() throws InterruptedException{
        driver = new ChromeDriver();
    }

    @Test
    public void alert_PopUp() throws InterruptedException{
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        driver.findElement(By.id("alertButton")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void confirmation_PopUp() throws InterruptedException{
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500)");
        driver.findElement(By.id("confirmButton")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().dismiss();
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void prompt_PopUp() throws InterruptedException{
        driver.get("https://demoqa.com/alerts");
        driver.manage().window().maximize();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 500)");
        driver.findElement(By.id("promtButton")).click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        alert.getText();
        alert.sendKeys("Rohit");
        alert.accept();
        Thread.sleep(5000);
        driver.quit();
    }

    @Test
    public void fileUpload_popUp() throws InterruptedException, IOException {
        driver.get("https://www.ilovepdf.com/split_pdf");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()='Select PDF file']")).click();
        Thread.sleep(2000);
        Runtime.getRuntime().exec("C:\\Users\\jadha\\Desktop\\AutoIT_Example.exe");
        Thread.sleep(5000);
        driver.findElement(By.id("processTaskTextBtn")).click();
        Thread.sleep(5000);
        driver.quit();
    }
}
