package ru.yandex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class Actions {
    public WebDriver driver;
    public WebDriverWait wait;

    public Actions(WebDriver driver) {
        this.driver = driver;
        wait = new WebDriverWait(driver, 1);
    }

    // Wait Wrapper Method
    public void waitVisability(By elementBy) {
        wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(elementBy));
    }

    // Chose Window Method
    public void choseThisWindow() {
        for(String winHandle : driver.getWindowHandles()) {
            driver.switchTo().window(winHandle);
        }
    }

    // Click Method
    public void click(By elementBy) {
        waitVisability(elementBy);
        driver.findElement(elementBy).click();
    }

    // Write Text Method
    public void write(By elementBy, String text) {
        driver.findElement(elementBy).sendKeys(text);
    }

    // Make Screenshot Method
    public void screen() throws IOException {
        Screenshot screenshot =
                new AShot().
                        shootingStrategy(ShootingStrategies.
                                viewportPasting(1000)).
                        takeScreenshot(driver);
        ImageIO.write(screenshot.getImage(), "jpg",
                new File( "src/test/java/test/screenshot.jpg"));
    }

}
