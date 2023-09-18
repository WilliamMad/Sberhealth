package ru.sberhealth.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class AnalyzesPage {

    SelenideElement changeCity = $("[data-testid=select-city-button-name]");
    SelenideElement choiceCity = $("[data-testid=text-input-component]");
    SelenideElement currentCity = $("[class=h1u40cpn__20230914154958]");
    SelenideElement changeCityButton = $("[class=b1ug8pyf__20230914154958]");
    SelenideElement buttonToCart = $("[data-testid=button-component]");
    SelenideElement detailCard = $("[class=akl2kaq__20230914154958]");
    SelenideElement cartButton = $("[data-testid=analyses-shop-cart-button]");


    public void changeCity(String city) {
        changeCityButton.click();
        changeCity.click();
        choiceCity.setValue(city);
        currentCity.click();
    }

    public void addToCart() {
        buttonToCart.click();
    }

    public String analyzeNameRememberer() {
        return detailCard.getText();
    }

    public void goToCart() {
        cartButton.click();
    }

}
