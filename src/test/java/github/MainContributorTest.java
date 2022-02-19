package github;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;

public class MainContributorTest {

    @Test
    void andreiSolntsevShoulbBeTheMainConstributor() {
        //открыть страницу репы selenide
        open("https://github.com/selenide/selenide");

        //подвести мышку к первому элементу Contributors
        $(".Layout-sidebar").$(withText("Contributors")).
               closest(".BorderGrid-row").$("ul li").hover();

       // $(".Layout-sidebar").$(withText("Contributors")).parent().sibling(0).$("data-octo-click=hovercard-link-click").hover(); //todo
        sleep(10000);
        //check: в появившемся окошке (оверлей) текст Andrei Solntsev

       // $$(".Popover-message").findBy(visible).shouldHave(text("Andrei Solntsev"));

    }
}
