package sampleApp;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import sampleApp.HelloWorld;

import java.util.concurrent.TimeUnit;

public class framesPractice {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = HelloWorld.setChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor)driver;
        driver.get("https://www.hyrtutorials.com/p/frames-practice.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);
//--------------------------single frame------------------------------------------
        driver.switchTo().frame(driver.findElement(By.id("frm1")));
        Select sc = new Select(driver.findElement(By.id("selectnav2")));
        sc.selectByVisibleText("Home");
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        WebElement name = driver.findElement(By.id("name"));
        name.sendKeys("Hello world");
        Thread.sleep(2000);
        int size = driver.findElements(By.tagName("iframe")).size();
        System.out.println("Size:-"+size);
        js.executeScript("window.scrollBy(0,2050)","");
        js.executeScript("arguments[0].scrollIntoView(true);","");

//--------------------nested frames--------------------------------------------------/
        driver.switchTo().frame(driver.findElement(By.id("frm3")));
        driver.switchTo().frame(driver.findElement(By.id("frm2")));
        WebElement element = driver.findElement(By.name("fName"));
        element.sendKeys("firstname");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.switchTo().parentFrame();
        WebElement element1 = driver.findElement(By.id("name"));
        element1.sendKeys("helloWorld");
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        WebElement element2 = driver.findElement(By.id("name"));
        element2.sendKeys("helloWorld");

    }
}
