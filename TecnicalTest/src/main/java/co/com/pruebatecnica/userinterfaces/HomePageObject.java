package co.com.pruebatecnica.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePageObject {

        /**
         * TITULO
         */
        public static final Target TITLE = Target.the("Title").located(By.id("logo"));

        /**
         * MENU
         */
        public static final Target HOMBRE_OPTION = Target.the("Opcion Hombre").located(By.xpath("//*[text()= 'Hombre']"));
        public static final Target MUJER_OPTION = Target.the("Opcion Mujer").located(By.xpath("//*[text()= 'Mujer']"));
        public static final Target JNIOR_OPTION = Target.the("Opcion Junior").located(By.xpath("//*[text()= 'Junior']"));
        public static final Target NINOS_OPTION = Target.the("Opcion Ninos").located(By.xpath("//*[text()= 'Ni\u00f1os']"));
        public static final Target ACCESORIOS_OPTION = Target.the("Opcion Accesorios").located(By.xpath("//*[text()= 'Accesorios']"));
        public static final Target OFERTAS_OPTION = Target.the("Opcion Ofertas").located(By.xpath("//*[text()= 'Ofertas']"));

        /**
         * BANNERS
         */
        public static final Target BANNER_ACTIVATE = Target.the("Banner activo").located(By.xpath("//div[@class = 'owl-item ng-tns-c26-11 ng-trigger ng-trigger-autoHeight ng-star-inserted active']"));
        public static final Target BANNER_1 = Target.the("Banner 1").located(By.xpath("//img[@alt= 'banner-pricipal1']"));
        public static final Target BANNER_2 = Target.the("Banner 2").located(By.xpath("//img[@alt= 'banner-principal2']"));
        public static final Target BUTTON_NEXT = Target.the("Button Next").located(By.className("//div[@id= 'home-container']/app-images-carousel/owl-carousel-o/div/div[2]/div[2]"));

        /**
         * OPTIONS
         */
        public static final Target MODA_INFANTILE = Target.the("Moda Infantil").located(By.xpath("//*[text()= 'MODA INFATIL']"));
        public static final Target PROTECCION = Target.the("Proteccion").located(By.xpath("//*[text()= 'PROTECCION']"));

        /**
         * OTHER OPTIONS
         */
        public static final Target OTHER_OPTIONS = Target.the("PRODUCTOS MAS BUSCADOS").located(By.xpath("//*[text()= 'PRODUCTOS M\u00c1S BUSCADOS']"));

        /**
         * FUNCTIONS
         */

        public static final Target SEARCH_OPTIONS = Target.the("Search Option").located(By.id("search-wrapper"));
        public static final Target CART_SHOPPING = Target.the("Cart Shopping").located(By.xpath("//div[@id='header-container']/header/a"));
        public static final Target PROFILE = Target.the("Profile").located(By.xpath("//div[@id='header-container']/header/img[3]"));
        public static final Target LOGIN = Target.the("Login").located(By.xpath("//*[text()= 'Iniciar sesi\u00f3n']"));

        /**
         * PRODUCTS
         */
        public static final Target PRODUCT = Target.the("Product").located(By.xpath("//app-root[@ng-version='12.1.5']/div/app-products/app-products-list/div/section/app-product-card[1]/div/div[2]"));
        public static final Target MESAGGE = Target.the("Mesagge").located(By.xpath("//*[text()= 'Closthesstore LATAM']"));
}


