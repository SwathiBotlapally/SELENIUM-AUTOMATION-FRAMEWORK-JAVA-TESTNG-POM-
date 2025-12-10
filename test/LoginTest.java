import org.testng.annotations.Test;
import pages.LoginPage;
import org.testng.Assert;

public class LoginTest extends BaseTest {

    @Test
    public void testValidLogin() {
        LoginPage login = new LoginPage(driver);
        login.enterUsername("student");
        login.enterPassword("Password123");
        login.clickLogin();

        Assert.assertTrue(driver.getPageSource().contains("Logged In Successfully"));
    }
}
