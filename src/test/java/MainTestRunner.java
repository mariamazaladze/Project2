
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import com.codeborne.selenide.testng.ScreenShooter;
import io.qameta.allure.*;
import io.qameta.allure.selenide.AllureSelenide;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import steps.*;
import utils.ChromeAndweb;
import variable.Parametrs;

import static com.codeborne.selenide.FileDownloadMode.HTTPGET;

@Listeners({ScreenShooter.class})
public class MainTestRunner {
    public static String reportsFolder;

    public void conf() {
        Configuration.screenshots = true;
        Configuration.fileDownload = HTTPGET;
        reportsFolder = "C:\\Users\\mazaladze\\Desktop\\Mariam Azaladze\\IT ACADEMY\\Project 2\\Project2\\allure-results";
        SelenideLogger.addListener("AllureSelenide", new AllureSelenide().screenshots(true).savePageSource(true));
    }

    ChromeAndweb openlink = new ChromeAndweb();
    MainPageMethods mainPage = new MainPageMethods();
    RegisterAccountMethods registartion = new RegisterAccountMethods();
    Parametrs parametrs = new Parametrs();
    MenuPanellMethods MenuPanell = new MenuPanellMethods();
    LeptopsAndNotebooksMethods leptopsAndNotebooks = new LeptopsAndNotebooksMethods();
    LeftMenuMethods leftMenu = new LeftMenuMethods();
    MP3PlayersMethods MP3Players = new MP3PlayersMethods();
    IpodTouchMethods IpodTouch = new IpodTouchMethods();
    CartMethods cart = new CartMethods();
    CheckoutMethods checkout = new CheckoutMethods();


    @Test(groups = {"Resgression2"})
    @Epic("რეგისტრაცია")
    @Flaky
    @Description(" რეგისტრაცია  ")
    @Severity(SeverityLevel.BLOCKER)
    @Link("https://github.com/mariamazaladze/Project2")
    public void registartion() {
        openlink.openChromeWithLink();
        mainPage.myAccountChlick()
                .RegisterClick();
        registartion.setName(parametrs.name)
                .setlastname(parametrs.lastname)
                .setEmail(parametrs.mail)
                .setTelephone(parametrs.telephone)
                .setPassword(parametrs.password)
                .setConfirmPassword(parametrs.password)
                .checkProvacyPolicy()
                .scroll()
                .checkagree();
    }


    @Test(groups = {"Resgression1"})
    @Feature("sort ვალიდაცია")
    public void leptopSort() {
        openlink.openChromeWithLink();
        MenuPanell.LaptopsAndNotebooksClick()
                .showAllLaptops();
        leptopsAndNotebooks.sortClick()
                .sortHigh()
                .priceCheck();
    }


    @Test(dependsOnMethods = {"registartion"}, groups = {"Resgression2"})
    @Story("პროდუქტის დამატება")
    @Description(" პროდუქტის დამატება ")
    public void addCart() throws InterruptedException {
        MenuPanell.DesktopsClick()
                .showAllDesktops();
        leftMenu.selectMP3Players();
        MP3Players.scroll()
                .iPodShuffleClick();
        IpodTouch.iponTouchCounter()
                .iPodTouchPrice()
                .iPodTouchAddCard();
        cart.getFulltextCart()
                .getPriceCart()
                .getQuantityCart()
                .checkCartQuantity()
                .checkCartPrice()
                .clickcart()
                .getcartsubtotal()
                .clickcheckout();
    }


    @Test(dependsOnMethods = {"addCart", "registartion"}, groups = {"Resgression2"}, retryAnalyzer = Retry.class)
    @Story("პროდუქტის შეძენა")
    @Description(" პროდუქტის შეძენა ")
    public void orderingItem() {
        checkout.setName()
                .setLastname()
                .setCompany()
                .setAddress1()
                .setAddress2()
                .setCity()
                .setPostcode()
                .setCountry()
                .setState()
                .clickNext()
                .clickNext2()
                .getFlatRateFull()
                .getFlatRatePrice()
                .clickNext3()
                .agree()
                .clickNext4()
                .subTotal()
                .getconfirmFlatRate()
                .checkFlatRate()
                .checktotalprice();
    }

}


