package acessos;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pages.*;
import suporte.Web;
//jhonatan magalhães do vale
public class saucedemoPageObjectTest {
    private WebDriver navegador;
    @Before
    public void AbrirNav(){
        navegador = Web.creatChrome();
    }
    @Test
    public void testAcessosite() throws InterruptedException {

        new LoginPage(navegador)
                .digitaUser("standard_user")
                .digitaPass("secret_sauce")
                .ClicaEntrar();
        new ProdutosPage(navegador)
                .ordenarProd()
                .SelecionaIten()
                .clicaCarrinho();
        new CarrinhoPage(navegador)
                .ClicaCheckout();
        new CheckOutPage(navegador)
                .digitaNomRem("jhonatan")
                .digitaSegNomRem("Novo Funcionário")
                .digitaZipRem("78555-386")
                .ClicaSeguir();
        new ConfirmacaoPage(navegador)
                .ClicaCheckout()
                .ConfirmaSucessoCompra();

    }
}
//jhonatan magalhães do vale