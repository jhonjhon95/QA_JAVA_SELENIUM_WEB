package suporte;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Web {

    public static WebDriver creatChrome(){
        System.setProperty("webdriver.chrome.driver", "C:\\drivers\\chromedriver.exe"); //abrindo o navegador / Avaliador observe onde está seu drive
        WebDriver navegador = new ChromeDriver();
        navegador.get("https://www.saucedemo.com/");//abrindo o site
        return navegador;
    }
}
