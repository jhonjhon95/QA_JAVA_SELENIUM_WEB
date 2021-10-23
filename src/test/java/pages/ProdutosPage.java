package pages;//jhonatan magalhães do vale
//jhonatan magalhães do vale
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class ProdutosPage {
    private WebDriver navegador;

    public ProdutosPage(WebDriver navegador) {
        this.navegador = navegador;
    }
    public ProdutosPage ordenarProd() throws InterruptedException {
        Thread.sleep(1000);
        navegador.findElement(By.className("product_sort_container")).click(); // ordenando
        Select ordem = new Select(navegador.findElement(By.className("product_sort_container"))); // ordenando,
        ordem.selectByValue("lohi");
        return this;
    }
    public ProdutosPage SelecionaIten() throws InterruptedException {
        Thread.sleep(1000);
        navegador.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();// seleciona item1
        navegador.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click(); //seleciona item2
        return this;
    }
    public CarrinhoPage clicaCarrinho() throws InterruptedException {
        Thread.sleep(1000);
        navegador.findElement(By.className("shopping_cart_link")).click(); //acessando o carrinho
        return new CarrinhoPage (navegador);
    }//jhonatan magalhães do vale

}
//jhonatan magalhães do vale