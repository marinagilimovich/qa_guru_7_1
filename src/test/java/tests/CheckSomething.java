package tests;

import org.junit.jupiter.api.Test;
import static com.codeborne.selenide.Selenide.open;

public class CheckSomething {

    @Test
    void checkSomething() {
        open("https://www.google.com/");
    }

}
