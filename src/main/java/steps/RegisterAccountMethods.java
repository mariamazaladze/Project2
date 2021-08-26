package steps;

import pageObject.RegisterAccount;

public class RegisterAccountMethods {
    RegisterAccount registration = new RegisterAccount();

    public RegisterAccountMethods setName(String name) {
        registration.firstname.sendKeys(name);
        return this;
    }

    public RegisterAccountMethods setlastname(String lastname) {
        registration.lastname.sendKeys(lastname);
        return this;
    }

    public RegisterAccountMethods setEmail(String email) {
        registration.email.sendKeys(email);
        return this;
    }

    public RegisterAccountMethods setTelephone(String telephone) {
        registration.telephone.sendKeys(telephone);
        return this;
    }

    public RegisterAccountMethods setPassword(String password) {
        registration.password.sendKeys(password);
        return this;
    }

    public RegisterAccountMethods setConfirmPassword(String confirmPassword) {
        registration.confirmPassword.sendKeys(confirmPassword);
        return this;
    }

    public RegisterAccountMethods checkProvacyPolicy() {
        registration.provacyPolicy.click();
        return this;
    }

    public RegisterAccountMethods scroll() {
        registration.provacyPolicy.scrollTo();
        return this;
    }

    public RegisterAccountMethods checkagree() {
        registration.agree.click();
        return this;
    }

}
