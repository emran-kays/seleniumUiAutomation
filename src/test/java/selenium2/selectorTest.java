package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class selectorTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("https://demoqa.com/select-menu");
        System.out.println(driver.getTitle());
        Thread.sleep(3000);

        Select sl = new Select(driver.findElement(By.id("oldSelectMenu")));
        sl.selectByIndex(2);
        Thread.sleep(3000);

        sl.selectByValue("4");
        Thread.sleep(3000);

        sl.selectByVisibleText("Blue");
        Thread.sleep(3000);

        driver.quit();
    }
}
