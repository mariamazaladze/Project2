
import org.testng.annotations.Test;
import steps.*;
import utils.ChromeAndweb;
import variable.Parametrs;

public class MainTestRunner {
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
    public void leptopSort() {
        openlink.openChromeWithLink();
        MenuPanell.LaptopsAndNotebooksClick()
                .showAllLaptops();
        leptopsAndNotebooks.sortClick()
                .sortHigh()
                .priceCheck();
    }

    @Test(dependsOnMethods = {"registartion"}, groups = {"Resgression2"})
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

    @Test(dependsOnMethods = {"addCart", "registartion"}, groups = {"Resgression2"})
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
                .clickNext3()
                .agree()
                .clickNext4()
                .subTotal()
                .checktotalprice();
    }

}


