package acessos;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//jhonatan magalhães do vale
import static org.junit.Assert.assertEquals;
//jhonatan magalhães do vale
public class saucedemoTest { @Test
    public void testAcessosite (){
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe"); //abrindo o navegador / Avaliador observe onde está seu drive
        WebDriver navegador = new ChromeDriver();
        navegador.get("https://www.saucedemo.com/");//abrindo o site
        navegador.findElement(By.id("user-name")).sendKeys("standard_user"); // inserir user
        navegador.findElement(By.id("password")).sendKeys("secret_sauce");// inserir senha
        navegador.findElement(By.name("login-button")).click();// clicar em entrar
        navegador.findElement(By.className("product_sort_container")).click(); // ordenando
            Select ordem = new Select(navegador.findElement(By.className("product_sort_container"))); // ordenando, poderia ter utilizado down + enter / mas me deu o trabalho de criar um select order
            ordem.selectByValue("lohi");
        navegador.findElement(By.id("add-to-cart-sauce-labs-onesie")).click();// seleciona item1
        navegador.findElement(By.id("add-to-cart-test.allthethings()-t-shirt-(red)")).click(); //seleciona item2
        navegador.findElement(By.className("shopping_cart_link")).click(); //acessando o carrinho
        navegador.findElement(By.id("checkout")).click(); //checkout
        navegador.findElement(By.id("first-name")).sendKeys("jhonatan"); //inserindo dados para postagem
        navegador.findElement(By.id("last-name")).sendKeys("Novo Colaborador"); //inserindo dados para postagem
        navegador.findElement(By.id("postal-code")).sendKeys("78555-386"); //inserindo dados para postagem
        navegador.findElement(By.id("continue")).click(); //continuando
        navegador.findElement(By.id("finish")).click(); //finalizando

    WebElement sucessovenda = navegador.findElement(By.className("complete-header"));
    String mensagem = sucessovenda.getText();
    assertEquals("THANK YOU FOR YOUR ORDER", mensagem);
    }
}//jhonatan magalhães do vale

//jhonatan magalhães do vale
