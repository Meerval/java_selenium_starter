package test;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.junit.Test;

import java.io.IOException;

public class StartTest extends WebDriverSettings {

    @Test
    public void firstTest() throws IOException {
        main.goTo(); //  open yandex.ru
        main.choseButton("Маркет");
        main.research("ноутбук xiaomi redmibook");
        main.putTick("Сначала предложения в моём регионе");
        main.getScreen();
    }
}
