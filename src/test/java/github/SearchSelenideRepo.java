package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class SearchSelenideRepo {

    @Test
    public void shouldFindSelenideInGithub() {
        //открыть странциу github.com
        open("https://github.com/");

        //ввести в поле поиске selenide и нажать Enter
        $("[data-test-selector=nav-search-input]").setValue("selenide").pressEnter();

        //нажимаем на link от первого результата поиска
        $$("ul.repo-list li").first().$("a").click();

        //check: в заголовке встречается selenide/selenide
        $("h1").shouldHave(text("selenide/selenide"));
    }
}

//ARRANGE
//ACT
//ASSERT