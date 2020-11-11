package business.ui.pages;

import business.ui.elements.duckduck.SearchElement;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import groovy.util.ObservableSet;

import java.security.PublicKey;

import static com.codeborne.selenide.Selenide.$$x;
import static com.codeborne.selenide.Selenide.$x;

public class DuckduckgoPage {

    public static void open() {
        Selenide.open("https://duckduckgo.com");
    }

    public SelenideElement search() {
        return $x("//input[@name='q']");
    }

    public SelenideElement submit() {
        return $x("//input[@type='submit']");
    }

    public ElementsCollection searchResults() {
        return $$x("//*[@class='result__a']");
    }

//    public SearchElement search() {
//        return new SearchElement();
//    }


}
