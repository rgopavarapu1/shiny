import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import java.util.List;

public class travelBooking {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        // Select country
        // driver.findElement(By.id("autosuggest")).sendKeys("IND");
        // List<WebElement> autosuggestList = driver.findElements(By.xpath("//li[@class='ui-menu-item']/a"));
        // List<WebElement> autosuggestList = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
        // Thread.sleep(1000);
        // for(WebElement option: autosuggestList) {
        //     System.out.println(option.getText());
        //     if(option.getText().equalsIgnoreCase("India")) {
        //         option.click();
        //         break;
        //     }
        // }
        // Select Departure city
        driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXTaction")).click();
        Thread.sleep(1000);
        // driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT'] //a[@value='MAA']"));

        driver.findElement(By.xpath("//a[@value='BLR']")).click();
        // driver.findElement(By.cssSelector("a[text*=BLR]")).click();

        // driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();

        // Select departure date(today)
        // driver.findElement(By.id("ctl00_mainContent_view_date1")).click();
        // driver.findElement(By.cssSelector("a[class='ui-state-default.ui-state-highlight']")).click();
        // driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-active")).click();

        // Select checkbox
        driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount")).click();

        // Select passenger
        driver.findElement(By.id("divpaxinfo")).click();

        Thread.sleep(1000);
        for(int i = 0; i < 5; i++) {
            driver.findElement(By.id("hrefIncAdt")).click();
        }
        System.out.println(driver.findElement(By.id("divpaxinfo")).getText());

        // Select currency
        WebElement staticDropDown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
        Select element = new Select(staticDropDown);
        element.selectByVisibleText("INR");
        Thread.sleep(1000);

        
        // click on search
        driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();

        driver.quit();

    }

}
