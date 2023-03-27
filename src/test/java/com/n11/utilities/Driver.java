package com.n11.utilities;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

public class Driver {

    private final ConfigurationReader configurationReader;
    private final WebDriver webDriver;
    private String currentWindow;

    public Driver(ConfigurationReader configurationReader) {
        this.configurationReader = configurationReader;
        this.webDriver = createRemoteWebdriver();
    }

    public WebDriver driver() {
        return this.webDriver;
    }

    private final ThreadLocal<WebDriver> driverPool = new ThreadLocal<>();

    public WebDriver createRemoteWebdriver() {

        if (driverPool.get() == null) {

            String browser = this.configurationReader.getProperty("browser");
            switch (browser) {
                case "chrome":
                    WebDriverManager.chromedriver().setup();
                    driverPool.set(new ChromeDriver());
                    break;
                case "firefox":
                    WebDriverManager.firefoxdriver().setup();
                    driverPool.set(new FirefoxDriver());
                    break;
                case "ie":
                    WebDriverManager.iedriver().setup();
                    driverPool.set(new InternetExplorerDriver());
                    break;
                case "safari":
                    WebDriverManager.safaridriver().setup();
                    driverPool.set(new SafariDriver());
                    break;
                default:
                    throw new RuntimeException("Driver Not Found For " + browser + " browser");
            }
        }
        return driverPool.get();
    }

    public void closeDriver() {
        driverPool.get().quit();
        driverPool.remove();
    }

    public void switchToWindow(String windowTitle) {
        currentWindow = webDriver.getWindowHandle();
        Set<String> windows = webDriver.getWindowHandles();
        for (String window: windows) {
            webDriver.switchTo().window(window);
            webDriver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
            if (webDriver.getTitle().equals(windowTitle)) {
                break;
            }
        }
    }

    public void switchToMainWindow() {
        webDriver.switchTo().window(currentWindow);
    }

}
