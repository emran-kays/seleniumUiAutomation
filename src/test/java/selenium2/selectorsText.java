package selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class selectorsText {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

        driver.get("https://parabank.parasoft.com/");

        System.out.println(driver.getTitle());

        String txt = driver.findElement(By.className("caption")).getText().trim();

        System.out.println(txt);

        driver.findElement(By.linkText("Register")).click();
        Thread.sleep(3000);

        driver.findElement(By.partialLinkText("in in")).click();
        Thread.sleep(3000);

        driver.findElement(By.cssSelector("input[name='username']")).sendKeys("adghff");
        Thread.sleep(3000);

        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("abba");
        Thread.sleep(3000);


        List<WebElement> list = driver.findElements(By.tagName("a"));
        for (WebElement element : list) {

            System.out.println(element.getText());
            System.out.println(element.getDomAttribute("href"));

        }

        driver.quit();

    }
}