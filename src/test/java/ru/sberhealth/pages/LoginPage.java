package ru.sberhealth.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class LoginPage {

    SelenideElement registrationForm = $("[class=liy0l1d__20230914154958]");

    public void registrationForm(String text) {
        registrationForm.shouldHave(text(text));
    }
}
