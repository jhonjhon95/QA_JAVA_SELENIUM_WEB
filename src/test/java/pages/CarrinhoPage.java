package pages;//jhonatan magalhães do vale
//jhonatan magalhães do vale
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//jhonatan magalhães do vale
public class CarrinhoPage {
    private WebDriver navegador;
    public CarrinhoPage(WebDriver navegador) {
        this.navegador = navegador;
    }
    public CarrinhoPage ClicaCheckout() throws InterruptedException {
        Thread.sleep(1000);
        navegador.findElement(By.id("checkout")).click(); //checkout
        return this;
    }
}
//jhonatan magalhães do vale