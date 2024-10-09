import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class webpage {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
// From above page select login using Practice locator as reference
        driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button[1]"));

        
    }
}
