package ru.sberhealth.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class OnlineConsultationPage {

    SelenideElement specialization = $("[class=Input__iaxpyys]");
    SelenideElement blockWithDoctor = $("[data-testid*='catalog-doctor-wrapper']");


    public void doctorSpecializationChoice(String text) {
        specialization.click();
        specialization.setValue(text).pressEnter();
    }

    public void checkingResults(String text) {
        blockWithDoctor.shouldHave(text(text));
    }

}
