package selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Alert {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("https://demoqa.com/alerts");

        driver.findElement(By.id("alertButton")).click();
        Thread.sleep(3000);

        driver.switchTo().alert().accept();
        Thread.sleep(3000);

        driver.findElement(By.id("confirmButton")).click();
        Thread.sleep(3000);

        driver.switchTo().alert().dismiss();
        Thread.sleep(3000);

        driver.findElement(By.id("promptButton")).click();
        Thread.sleep(3000);

        driver.switchTo().alert().sendKeys("dfgjhdfjgh");
        Thread.sleep(3000);
        System.out.println(driver.switchTo().alert().getText());
        Thread.sleep(3000);
        driver.switchTo().alert().accept();

        driver.quit();

    }
}