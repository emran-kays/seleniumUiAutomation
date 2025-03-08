package selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FrameTest {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://demoqa.com/frames");

        System.out.println("outside ifreme1"+driver.findElement(By.cssSelector(".text-center")).getText());

        driver.switchTo().frame("frame1");

        System.out.println("Inside Iframe"+driver.findElement(By.id("sampleHeading")).getText());

        driver.switchTo().defaultContent();

        System.out.println("outside ifreme2"+driver.findElement(By.cssSelector(".text-center")).getText());

        driver.quit();

    }
}
