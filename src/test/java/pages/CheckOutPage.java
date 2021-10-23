package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//jhonatan magalhães do vale
public class CheckOutPage {
    private WebDriver navegador;

    public CheckOutPage(WebDriver navegador) {
        this.navegador = navegador;
    }

    public CheckOutPage digitaNomRem (String NomeRem) throws InterruptedException {
        Thread.sleep(1000);
        navegador.findElement(By.id("first-name")).sendKeys(NomeRem); //inserindo dados para postagem
        return this;
    }
    public CheckOutPage digitaSegNomRem (String SegNomeRem) throws InterruptedException {
        Thread.sleep(1000);
        navegador.findElement(By.id("last-name")).sendKeys(SegNomeRem); //inserindo dados para postagem
        return this;
    }
    public CheckOutPage digitaZipRem (String ZipRem) throws InterruptedException {
        Thread.sleep(1000);
        navegador.findElement(By.id("postal-code")).sendKeys(ZipRem); //inserindo dados para postagem
        return this;
    }
    public ConfirmacaoPage ClicaSeguir() throws InterruptedException {
        Thread.sleep(1000);
        navegador.findElement(By.id("continue")).click(); //continuando
        return new ConfirmacaoPage(navegador);
    }
    }//jhonatan magalhães do vale

//jhonatan magalhães do vale


