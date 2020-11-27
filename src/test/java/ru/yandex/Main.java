package ru.yandex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Main extends Actions{

    String SITE_URL = "https://yandex.ru/";

    public Main(WebDriver driver) {
        super(driver);
    }

    // 2. Open the site page
    public void goTo() {
        driver.get(SITE_URL);
    }

    // 3. Chose and click the button
    public void choseButton(String button) {
        click(By.xpath("//div[text()='" + button + "']"));
    }

    // 4,5. Print the request on the chosen page
    public void search(String text) {
        choseThisWindow();
        write(By.id("header-search"), text);    // 4. Write the request
        click(By.className("_1XiEJDPVpk"));   // 5. Start
        // search
    }

    // 6. Put some ticks on the page
    public void putTick(String tick) {
        click(By.xpath("//span[text()='" + tick + "']"));
    }

    // 7. Make and save screenshot
    public void getScreen() throws IOException {
        screen();
    }
}
