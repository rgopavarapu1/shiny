import java.time.Duration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class loginPageRS {
    static String tempPwd;
    static String useraname = "IKEA";

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        // Attempt login
        driver.get("https://rahulshettyacademy.com/locatorspractice/"); // opens login page
        driver.findElement(By.id("inputUsername")).sendKeys(useraname); // Enter user name
        driver.findElement(By.name("inputPassword")).sendKeys("Levintw"); // Enter password
        driver.findElement(By.className("signInBtn")).click(); //Click submit button
        // Thread.sleep(1000);
        String errorMessage = driver.findElement(By.className("error")).getText();
        System.out.println(errorMessage);
        driver.findElement(By.linkText("Forgot your password?")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//input[@placeholder=\"Name\"]")).sendKeys("IKEA");
        driver.findElement(By.xpath("//input[@placeholder=\"Email\"]")).sendKeys("ikea@nokia.com");
        driver.findElement(By.xpath("//input[@placeholder=\"Phone Number\"]")).sendKeys("92748");
        Thread.sleep(1000);
        driver.findElement(By.className("reset-pwd-btn")).click();
        // driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
        String message = driver.findElement(By.cssSelector(".infoMsg")).getText();

        System.out.println(message);
        driver.findElement(By.className("go-to-login-btn")).click();

        // Pattern p = Pattern.compile("\'([^\']*)\'");
        // Matcher m = p.matcher(message);
        // while (m.find()) {
        //     tempPwd = m.group(1);
        // System.out.println(tempPwd);
        // }
        tempPwd = getTempPassword(message);
    
        driver.findElement(By.id("inputUsername")).sendKeys(useraname);
        driver.findElement(By.name("inputPassword")).sendKeys(tempPwd);
        Thread.sleep(1000);
        driver.findElement(By.className("signInBtn")).click(); //Click submit button
        Thread.sleep(1000);
        String loginMessage = driver.findElement(By.className("login-container")).getText();
        Thread.sleep(2000);
        // System.out.println(loginMessage.contains("IKEA"));
        Assert.assertTrue(loginMessage.contains("IKEA"));

        driver.findElement(By.className("logout-btn")).click();
        // Attempt forget password

        // Attempt login again using password shared
        Thread.sleep(2000);
        System.out.println(driver.getTitle());
        driver.quit();

    }

    public static String getTempPassword(String resetPasswordText) {

        String[] tempPwd = resetPasswordText.split("'");
        String tempPass = tempPwd[1].split("'")[0];

        return tempPass;

    }
}
