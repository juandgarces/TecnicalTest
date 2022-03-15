package co.com.pruebatecnica.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class ShoppingCar {

    public static final Target DESCRIPTION = Target.the("Description").located(By.className("item-quantity"));
    public static final Target PRICE = Target.the("Proce").located(By.xpath("//div[@class = 'cart-item ng-star-inserted']/div[2]"));
    public static final Target REMOVE_ITEM = Target.the("Remove Item").located(By.xpath("//div[@class = 'cart-item ng-star-inserted']/div[5]/button"));
    public static final Target TITLE = Target.the("Title").located(By.xpath("//*[text()= ' Items en tu carrito']"));
    public static final Target SUBTOTAL = Target.the("Subtotal").located(By.xpath("//div[@class = 'summary-subtotal']"));
    public static final Target TOTAL = Target.the("Subtotal").located(By.xpath("//div[@class = 'summary-total']"));
    public static final Target TO_PAY = Target.the("To Pay").located(By.xpath("//button[@class = 'checkout-cta']"));
    public static final Target MESSAGE_REMOVE = Target.the("Message remove").located(By.xpath("//h2[@id='swal2-title']"));
    public static final Target SUBTOTAL_VALUE = Target.the("Subtotal").located(By.xpath("//div[@class = 'subtotal']"));
    public static final Target CONFIRMATION= Target.the("Confirmar vaciado").located(By.xpath("//button[@class = 'swal2-confirm swal2-styled swal2-default-outline']"));
}
