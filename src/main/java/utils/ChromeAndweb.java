package utils;

import com.codeborne.selenide.Configuration;
import io.qameta.allure.Step;
//import com.sun.deploy.cache.BaseLocalApplicationProperties;

import static com.codeborne.selenide.FileDownloadMode.HTTPGET;
import static com.codeborne.selenide.Selenide.open;


public class ChromeAndweb {


    @Step("ბრაუზერის და ლინკის გახსნა")
    public void openChromeWithLink() {
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\mazaladze\\Desktop\\chromedriver\\91\\chromedriver.exe");
        Configuration.startMaximized = true;
        Configuration.screenshots = true;
        Configuration.fileDownload = HTTPGET;
        Configuration.reportsFolder="src/main/resources/Reports";
        Configuration.baseUrl = "http://tutorialsninja.com";
        open("/demo/");

    }
}
