package business.ui.elements.duckduck;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

public class SearchElement {

    public SelenideElement searchField(){
        return $x("//input[@name='q']");
    }

    public SelenideElement submitSearch(){
        return $x("//input[@type='submit']");
    }

}
