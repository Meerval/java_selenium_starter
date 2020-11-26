package ru.yandex;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import java.io.IOException;

public class Main extends Actions{

    String SITE_URL = "https://yandex.ru/";

    public Main(WebDriver driver) {
        super(driver);
    }

    public void goTo() {
        driver.get(SITE_URL);
    }

    public void choseButton(String button) {
        click(By.xpath("//div[contains(text(),'" + button + "')]"));
    }

    public void research(String text) {
        choseThisWindow();
        write(By.id("header-search"),text + "\n");
    }

    public void putTick(String tick) {
        click(By.xpath("//span[contains(text(),'" + tick + "')]"));
    }

    public void getScreen() throws IOException {
        screen();
    }
}
