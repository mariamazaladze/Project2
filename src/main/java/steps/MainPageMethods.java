package steps;

import pageObject.MainPageElements;

public class MainPageMethods {
    MainPageElements mainElemets = new MainPageElements();


    public MainPageMethods myAccountChlick() {
        mainElemets.myAccount.click();
        return this;
    }

    public MainPageMethods RegisterClick() {
        mainElemets.Register.click();
        return this;
    }

}
