package selenium3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class WindowTest {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.get("https://demoqa.com/browser-windows");

        System.out.println("main tab_1"+driver.findElement(By.cssSelector(".text-center")).getText());

        String originalWindow = driver.getWindowHandle();

        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.navigate().to("https://demoqa.com/sample");

        System.out.println("New tab"+driver.findElement(By.id("sampleHeading")).getText());
        Thread.sleep(3000);
        driver.close();

        Thread.sleep(2000);
        driver.switchTo().window(originalWindow);

        System.out.println("main tab_2"+driver.findElement(By.cssSelector(".text-center")).getText());

        driver.quit();

    }
}

