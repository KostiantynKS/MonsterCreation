package utils;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class BrowserUtils {

    public static int getElementCount(WebDriver driver, By locator) {
        List elements = driver.findElements(locator);
        return elements.size();
    }
    public static String generateRandomNumber() {
        Random random = new Random();
        return String.valueOf(random.nextInt(100) + 1);       // Convert int to String
    }
    public static void captureScreenshot(WebDriver driver) {
        try {
            File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

            String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
            File destination = new File("screenshots/screenshot_" + timestamp + ".png");
            destination.getParentFile().mkdirs();
            FileUtils.copyFile(screenshot, destination);
            System.out.println("Screenshot saved at: " + destination.getAbsolutePath());

        } catch (Exception e) {
            e.printStackTrace();
        }
    }



    }
