import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebDriver;

public class androidDeveloper {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://developer.android.com/tools/adb");
        Thread.sleep(1000);
        SearchContext shadow = driver.findElement(By.cssSelector("devsite-appearance-selector")).getShadowRoot();
        Thread.sleep(1000);
        System.out.println(shadow.findElement(By.cssSelector(".toggle")).getAttribute("data-appearance"));
        shadow.findElement(By.cssSelector(".toggle")).click();
        Thread.sleep(1000);
        shadow.findElement(By.cssSelector("ul li:nth-child(2) label[for='dark']")).click();
        Thread.sleep(1000);
        System.out.println(shadow.findElement(By.cssSelector(".toggle")).getAttribute("data-appearance"));

        driver.findElement(By.className("devsite-search-query")).click();
        driver.findElement(By.className("devsite-search-query")).sendKeys("adb commands to install apk");;
  


        driver.quit();
        
    }

}
