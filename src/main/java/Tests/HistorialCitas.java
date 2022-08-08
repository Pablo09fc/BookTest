package Tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HistorialCitas {

    
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\pablo\\Documents\\Ingeniería en Computación\\Ingeniería en Computación IV Cuatrimestre\\Calidad del Software\\BookTesting\\Project\\BookTest\\src\\main\\java\\Driver\\chromedriver.exe");

        //Intialize browser
        WebDriver driver = new ChromeDriver();

        //Se abre la página de pacientes
        driver.manage().window().maximize();
        driver.get("https://drasilvia.srdosis.com/index.php?view=medichistory&id=4");
    }
    
}
