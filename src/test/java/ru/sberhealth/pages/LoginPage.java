package ru.sberhealth.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    SelenideElement registrationForm = $("[data-testid=login-welcome-label]");


    public void registrationForm(String text) {
        registrationForm.shouldHave(text(text));
    }
}
