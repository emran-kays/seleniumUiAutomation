package selenium1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class placeOder {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://www.saucedemo.com/");

        driver.findElement(By.cssSelector("#user-name")).sendKeys("standard_user");
        driver.findElement(By.cssSelector("#password")).sendKeys("secret_sauce");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#login-button")).click();
        Thread.sleep(2000);

        driver.findElement(By.cssSelector("#add-to-cart-sauce-labs-backpack")).click();
        driver.findElement(By.cssSelector(".shopping_cart_link")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#checkout")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#first-name")).click();
        driver.findElement(By.cssSelector("#first-name")).sendKeys("imran");
        driver.findElement(By.cssSelector("#last-name")).sendKeys("kayes");
        driver.findElement(By.cssSelector("#postal-code")).sendKeys("1250");
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#continue")).click();
        Thread.sleep(2000);
        driver.findElement(By.cssSelector("#finish")).click();
        Thread.sleep(2000);
        driver.quit();
    }
}
