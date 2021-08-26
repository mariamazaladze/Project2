package steps;

import com.codeborne.selenide.Condition;
import org.testng.Assert;
import pageObject.Cart;
import variable.Parametrs;
//import io.qameta.allure.Step;

public class CartMethods {
    Cart cart = new Cart();
    Parametrs parametrs = new Parametrs();
    IpodTouchMethods ipodTouch = new IpodTouchMethods();

    String cartTextt;
    String cartCountt;
    String cartPrice;
    String cartSubtotal;

    //@Step("Left panel : click practiceform button")
    public CartMethods getFulltextCart() throws InterruptedException {
        Thread.sleep(1500);
        String cardText = cart.cartTotal.getText();
        cartTextt = cardText;
        return this;
    }

    public CartMethods getQuantityCart() {
        String cardCount = cartTextt.substring(0, 1);
        cartCountt = cardCount;
        return this;
    }

    public CartMethods getPriceCart() {
        int find$ = cartTextt.indexOf("$") + 1;
        int length = cartTextt.length();
        String priceCart = cartTextt.substring(find$, length - 1);
        cartPrice = priceCart;
        return this;
    }

    public CartMethods checkCartQuantity() {
        Assert.assertEquals(cartCountt, parametrs.ipodtouchCounter);
        return this;
    }

    public CartMethods checkCartPrice() {
        double ipodItemPrice = Double.parseDouble(ipodTouch.ipodPrice);
        double iponcount = Double.parseDouble(parametrs.ipodtouchCounter);
        double cartPricee = Double.parseDouble(cartPrice);
        double carttotalprice = ipodItemPrice * iponcount;
        Assert.assertEquals(cartPricee, carttotalprice);
        return this;
    }

    public CartMethods clickcart() {
        cart.cart.click();
        return this;
    }

    public CartMethods clickcheckout() {
        cart.chechOut.click();
        return this;
    }

    public CartMethods getcartsubtotal() {
        String carttotal = cart.cartsubtotal.getText();
        cartSubtotal = carttotal;
        return this;
    }


}
