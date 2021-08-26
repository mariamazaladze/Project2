package pageObject;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selectors.by;
import static com.codeborne.selenide.Selenide.$;

public class Checkout {
    public SelenideElement
            firstname = $("#input-payment-firstname"),
            lastname = $("#input-payment-lastname"),
            company = $("#input-payment-company"),
            address1 = $("#input-payment-address-1"),
            address2 = $("#input-payment-address-2"),
            city = $("#input-payment-city"),
            postcode = $("#input-payment-postcode"),
            country = $("#input-payment-country"),
            state = $("#input-payment-zone"),
            next = $("#button-payment-address"),
            next2 = $("#button-shipping-address"),
            next3 = $("#button-shipping-method"),
            agree = $(by("name", "agree")),
            next4 = $("#button-payment-method"),
            subTotal = $(By.xpath("//*[@id='collapse-checkout-confirm']/div/div[1]/table/tfoot/tr[1]/td[2]"));


}
