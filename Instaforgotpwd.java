package automation;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

    public class Instaforgotpwd {
        public static void main(String[] args) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\rampr\\IntellIJ\\chromedriver-win32\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

            try {
                // 1️⃣ Open Instagram Forgot Password Page
                driver.get("https://www.instagram.com/accounts/password/reset/");

                // 2️⃣ Wait until email/phone input field is visible
                WebElement emailInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("cppEmailOrUsername")));

                // 3️⃣ Enter Email (Replace with your actual email)
                emailInput.sendKeys("your_email@example.com");

                // 4️⃣ Click on "Send Login Link" button
                WebElement sendButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
                sendButton.click();

                System.out.println("✅ Forgot Password request sent successfully!");

            } catch (Exception e) {
                System.out.println("❌ Error: " + e.getMessage());
            } finally {
                // Close browser
                driver.quit();
            }
        }
    }

