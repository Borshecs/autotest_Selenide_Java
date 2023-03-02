import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$x;

/**
 * Главная страница сайта https://appleinsider.ru/
 */
public class MainPage {
    private final SelenideElement searchButton = $x("//form");

    public void clockOnSearch(){
        searchButton.click();
    }

    public void openWebSite(String url){
        Selenide.open(url);
    }

}
