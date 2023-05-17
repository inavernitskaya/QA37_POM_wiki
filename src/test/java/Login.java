import manage.ConfigurationWiki;
import models.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.MainScreen;

public class Login extends ConfigurationWiki {

    @Test
    public void login1() {
        User user = User.builder().userName("Innusik27").password("1234567Qq").build();
        boolean isLogged = new MainScreen(driver)
                .clickTheFlowButton()
                .cklickTheLoginButton()
                .fillInLoginForm(user)
                .clickTheFlowButton()
                .isLogged();
        Assert.assertTrue(isLogged);
    }


    @Test
    public void login2() {
        User user = User.builder().userName("Innusik27").password("1234567Qq").build();
        String inf = new MainScreen(driver)
                .clickTheFlowButton()
                .cklickTheLoginButton()
                .fillInLoginForm(user)
                .clickTheFlowButton()
                .getInf();
        Assert.assertEquals(inf, "Innusik27");

    }

    @Test
    public void login3(){
        User user = User.builder().userName("Innusik27").password("1234567Qq").build();
        String infOut= new MainScreen(driver)
                .clickTheFlowButton()
                .cklickTheLoginButton()
                .fillInLoginForm(user)
                .clickTheFlowButton()
                .getInfOut();
        Assert.assertEquals(infOut,"Log out");

    }
    @Test
    public void login4(){
        User user = User.builder().userName("Innusik27").password("1234567Qq").build();
        String infLog = new MainScreen(driver)
                .clickTheFlowButton()
                .cklickTheLoginButton()
                .fillInLoginForm(user)
                .clickTheFlowButton()
                .logOut()
                .clickTheFlowButton()
                .getIngLog();
        Assert.assertEquals(infLog, "Log in to Wikipedia");

    }

}




