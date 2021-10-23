package pages;
//jhonatan magalhães do vale
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//jhonatan magalhães do vale
import static org.junit.Assert.assertEquals;

public class ConfirmacaoPage {
    private WebDriver navegador;

    public ConfirmacaoPage(WebDriver navegador) {
        this.navegador = navegador;
    }
    public ConfirmacaoPage ClicaCheckout(){
        navegador.findElement(By.id("finish")).click(); //finalizando
        return this;
    }
    public ConfirmacaoPage ConfirmaSucessoCompra() throws InterruptedException {
        Thread.sleep(1000);
        WebElement sucessovenda = navegador.findElement(By.className("complete-header"));
        String mensagem = sucessovenda.getText();
        assertEquals("THANK YOU FOR YOUR ORDER", mensagem);
        return this;
    }
}


//jhonatan magalhães do vale