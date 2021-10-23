package pages;
//jhonatan magalhães do vale
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

//jhonatan magalhães do vale
public class LoginPage {
    private WebDriver navegador;

    public LoginPage(WebDriver navegador) {
        this.navegador = navegador;

    }
    public LoginPage digitaUser (String user) throws InterruptedException {
        Thread.sleep(1000);
        navegador.findElement(By.id("user-name")).sendKeys(user); // inserir user
        return this;
//jhonatan magalhães do vale
    }
    public LoginPage digitaPass (String pass) throws InterruptedException {
        Thread.sleep(1000);
        navegador.findElement(By.id("password")).sendKeys(pass);// inserir senha
        return this;

    }
    public ProdutosPage ClicaEntrar () throws InterruptedException {
        Thread.sleep(1000);
        navegador.findElement(By.name("login-button")).click();// clicar em entrar

        return new ProdutosPage(navegador);

    }
}


//jhonatan magalhães do vale