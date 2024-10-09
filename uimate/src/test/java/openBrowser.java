import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class openBrowser {
    public static void main(String[] args) {
        // Systemproperty for chromeDriver path is optional in latest chrome versions
        // System.setProperty("webdriver.edge.driver", "path_to_file");
        // WebDriver driver = new ChromeDriver();
        // WebDriver driver = new FirefoxDriver();
        WebDriver driver = new EdgeDriver();
        driver.get("http://www.amazon.com");
        System.out.println(driver.getTitle());
        
        driver.close();
        driver.quit();
    }
}
