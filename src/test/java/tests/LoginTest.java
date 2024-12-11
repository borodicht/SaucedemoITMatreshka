package tests;

import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void loginPositiveTest() {
        loginPage.open();
        loginPage.login("user-name", "secret_sauce");
    }
}
