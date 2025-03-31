package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class drivermethod {
    public static void main(String[] args) {
        // Set the path for the ChromeDriver
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rampr\\IntellIJ\\chromedriver-win32\\chromedriver.exe");

        // Initialize WebDriver
        WebDriver driver = new ChromeDriver();

        // Navigate to LinkedIn
        driver.get("https://www.linkedin.com/");

        // 📌 1️⃣ Get the Current URL
        System.out.println("Current URL: " + driver.getCurrentUrl());

        // 📌 2️⃣ Get the Page Source (printing only a substring to avoid excessive output)
        String pageSource = driver.getPageSource();
        System.out.println("Page Source (trimmed): " + pageSource.substring(0, 500) + "...");

        // 📌 3️⃣ Find a Single Element (Find the Sign-In button)
        WebElement signInButton = driver.findElement(By.xpath("//a[contains(text(),'Sign in')]"));
        System.out.println("Sign-In Button Text: " + signInButton.getText());

        // 📌 4️⃣ Find Multiple Elements (Find all links on the page)
        List<WebElement> allLinks = driver.findElements(By.tagName("a"));
        System.out.println("Total Links Found: " + allLinks.size());

        // 📌 5️⃣ Navigate to Another Page
        driver.navigate().to("https://www.google.com/");
        System.out.println("Navigated to Google: " + driver.getCurrentUrl());

        // 📌 6️⃣ Navigate Back
        driver.navigate().back();
        System.out.println("Back to LinkedIn: " + driver.getCurrentUrl());

        // 📌 7️⃣ Navigate Forward
        driver.navigate().forward();
        System.out.println("Forward to Google Again: " + driver.getCurrentUrl());

        // 📌 8️⃣ Refresh the Page
        driver.navigate().refresh();
        System.out.println("Page Refreshed");

        // 📌 9️⃣ Close the Browser
        driver.close(); // Closes the current tab
    }
}

