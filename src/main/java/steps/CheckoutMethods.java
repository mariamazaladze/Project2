package steps;

import io.qameta.allure.Step;
import org.testng.asserts.SoftAssert;
import pageObject.Checkout;
import variable.Parametrs;

public class CheckoutMethods {
    Checkout checkout = new Checkout();
    Parametrs parametrs = new Parametrs();
    SoftAssert softAssert = new SoftAssert();
    CartMethods cartMethods = new CartMethods();

    String subtotall;

    @Step("checkout მერე რეგისტრაცია და სახელის მნიშვნელობის გაწერა მონაცემთა ბაზიდან")
    public CheckoutMethods setName() {
        checkout.firstname.sendKeys(parametrs.name);
        return this;
    }
    @Step("checkout მერე რეგისტრაცია და გვარის მნიშვნელობის გაწერა მონაცემთა ბაზიდან")
    public CheckoutMethods setLastname() {
        checkout.lastname.sendKeys(parametrs.lastname);
        return this;
    }
    @Step("checkout მერე რეგისტრაცია და კომპანიის მნიშვნელობის გაწერა ")
    public CheckoutMethods setCompany() {
        checkout.company.sendKeys(parametrs.companyy);
        return this;
    }
    @Step("checkout მერე რეგისტრაცია და მისამართის1 მნიშვნელობის გაწერა ")
    public CheckoutMethods setAddress1() {
        checkout.address1.sendKeys(parametrs.address);
        return this;
    }
    @Step("checkout მერე რეგისტრაცია და მისამართი2 მნიშვნელობის გაწერა")
    public CheckoutMethods setAddress2() {
        checkout.address2.sendKeys(parametrs.address);
        return this;
    }
    @Step("checkout მერე რეგისტრაცია და ქალაქსი მნიშვნელობის გაწერა მონაცემთა ბაზიდან")
    public CheckoutMethods setCity() {
        checkout.city.sendKeys(parametrs.address);
        return this;
    }
    @Step("checkout მერე რეგისტრაცია და პოსტისკოდის მნიშვნელობის გაწერა ")
    public CheckoutMethods setPostcode() {
        checkout.postcode.sendKeys(parametrs.postcode);
        return this;
    }
    @Step("checkout მერე რეგისტრაცია და ქვეყნის მნიშვნელობის გაწერა ")
    public CheckoutMethods setCountry() {
        checkout.country.selectOption("Georgia");
        return this;
    }
    @Step("checkout მერე რეგისტრაცია და შტატის მნიშვნელობის გაწერა ")
    public CheckoutMethods setState() {
        checkout.state.selectOption("Tbilisi");
        return this;
    }
    @Step("checkout სტრული მონაცემები შევსებულია და გადასხვა შემდეგზე ")
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
    @Step("checkout მერე საბოლოო დათანხმება ")
    public CheckoutMethods agree() {
        checkout.agree.click();
        return this;
    }

    public CheckoutMethods clickNext4() {
        checkout.next4.click();
        return this;
    }
    @Step("საბოლო თანხის მნიშვნელობის წამოღება ")
    public CheckoutMethods subTotal() {
        checkout.subTotal.getText();
        subtotall = checkout.subTotal.getText();
        return this;
    }
    @Step("საბოლო თანხის შედარება კალათაში არსებული თანხასთან")
    public CheckoutMethods checktotalprice() {
        softAssert.assertEquals(subtotall, cartMethods.cartSubtotal);
        System.out.println("price is same");
        return this;
    }
}
