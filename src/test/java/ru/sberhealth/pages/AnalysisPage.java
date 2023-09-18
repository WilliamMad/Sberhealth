package ru.sberhealth.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class AnalysisPage {

    private final String city = "Санкт-Петербург";
    private final String analysis = "¹³С-уреазный дыхательный тест (Helicobacter pylori), выдыхаемый воздух";
    SelenideElement changeCity = $("[data-testid=select-city-button]");
    SelenideElement choiceCity = $("[data-testid=text-input-component]");
    SelenideElement currentCity = $("[data-testid=select-city-list-dropdown]").$(byText(city));
    SelenideElement buttonToCart = $("[data-testid=button-component]");
      SelenideElement cartButton = $("[data-testid=analyses-shop-cart-button]");
    SelenideElement searchResult = $("[data-testid=search-result-analyses]");



    public void changeCity() {
        changeCity.click();
        choiceCity.setValue(city);
        currentCity.click();
    }

    public void addToCart() {
        buttonToCart.click();
    }

    public void searchResult() {
        searchResult.shouldHave(text(analysis));
    }

    public void goToCart() {
        cartButton.click();
    }

}
