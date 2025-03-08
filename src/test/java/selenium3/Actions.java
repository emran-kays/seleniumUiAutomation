package selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;
import java.time.Duration;

public class Actions {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://demoqa.com/droppable");

        new org.openqa.selenium.interactions.Actions(driver)
                .dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable")))
                .perform();
        Thread.sleep(3000);

        new org.openqa.selenium.interactions.Actions(driver)
                .contextClick(driver.findElement(By.cssSelector(".text-center")))
                        .perform();
        Thread.sleep(3000);

        driver.findElement(By.tagName("body")).click();
        Thread.sleep(3000);
        
        driver.quit();

    }
}
