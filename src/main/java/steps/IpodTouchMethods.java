package steps;

import com.codeborne.selenide.Condition;
import pageObject.IPodTouch;
import variable.Parametrs;

public class IpodTouchMethods {
    IPodTouch iPodTouch = new IPodTouch();
    Parametrs parametrs = new Parametrs();

    public static String ipodPrice;
    public static String count;

    public IpodTouchMethods iPodTouchPrice() {
        String onlyPrice = iPodTouch.iponTouchPrice.getText().replace("$", "");
        ipodPrice = onlyPrice;
        return this;
    }

    public IpodTouchMethods iponTouchCounter() {
        iPodTouch.iponTouchCounter.clear();
        iPodTouch.iponTouchCounter.sendKeys(parametrs.ipodtouchCounter);
        String iponCount = iPodTouch.iponTouchCounter.getText();
        count = iponCount;
        return this;
    }

    public IpodTouchMethods iPodTouchAddCard() {
        iPodTouch.iponTouchAddCard.click();
        return this;
    }

}
