package steps;

import org.testng.asserts.SoftAssert;
import pageObject.Checkout;
import variable.Parametrs;

public class CheckoutMethods {
    Checkout checkout = new Checkout();
    Parametrs parametrs = new Parametrs();
    SoftAssert softAssert = new SoftAssert();
    CartMethods cartMethods = new CartMethods();

    String subtotall;

    public CheckoutMethods setName() {
        checkout.firstname.sendKeys(parametrs.name);
        return this;
    }

    public CheckoutMethods setLastname() {
        checkout.lastname.sendKeys(parametrs.lastname);
        return this;
    }

    public CheckoutMethods setCompany() {
        checkout.company.sendKeys(parametrs.companyy);
        return this;
    }

    public CheckoutMethods setAddress1() {
        checkout.address1.sendKeys(parametrs.address);
        return this;
    }

    public CheckoutMethods setAddress2() {
        checkout.address2.sendKeys(parametrs.address);
        return this;
    }

    public CheckoutMethods setCity() {
        checkout.city.sendKeys(parametrs.address);
        return this;
    }

    public CheckoutMethods setPostcode() {
        checkout.postcode.sendKeys(parametrs.postcode);
        return this;
    }

    public CheckoutMethods setCountry() {
        checkout.country.selectOption("Georgia");
        return this;
    }

    public CheckoutMethods setState() {
        checkout.state.selectOption("Tbilisi");
        return this;
    }

    public CheckoutMethods clickNext() {
        checkout.next.click();
        return this;
    }

    public CheckoutMethods clickNext2() {
        checkout.next2.click();
        return this;
    }

    public CheckoutMethods clickNext3() {
        checkout.next3.click();
        return this;
    }

    public CheckoutMethods agree() {
        checkout.agree.click();
        return this;
    }

    public CheckoutMethods clickNext4() {
        checkout.next4.click();
        return this;
    }

    public CheckoutMethods subTotal() {
        checkout.subTotal.getText();
        subtotall = checkout.subTotal.getText();
        return this;
    }

    public CheckoutMethods checktotalprice() {
        softAssert.assertEquals(subtotall, cartMethods.cartSubtotal);
        System.out.println("price is same");
        return this;
    }
}
