package PageObjects;
        
        import Elements.AdLabel;
        import Elements.Button;
        import Elements.Html_label;
        import Waiter.Waiter;
        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.support.FindBy;
        
        import java.util.List;
        
        import static Waiter.Waiter.waitForClick;
        
        public class BasketPage extends BasePage {
 
             public BasketPage (WebDriver driver){
                super(driver);
            }
 
             @FindBy(id = "popup-checkout")
     private Button confirmOrderButton;

            @FindBy(css = ".cart-promotions-inner > div > div")
            private List<AdLabel> sales;

            @FindBy(css = "[class = \"slider-inner cart-slider-inner\"] > div > div")
            private List<AdLabel> ads;

            @FindBy(css = ".cart-recommend-inner > div >div")
            private List<AdLabel> recommend;
 
             @FindBy(name = "plus")
     private Html_label buttonPlus;
 
             @FindBy(name = "minus")
     private Html_label buttonMinus;
 
             public void confirm_order(){
                waitForClick(driver, confirmOrderButton,5);
                confirmOrderButton.click();
            }
 
             public void addOneMore() {
                waitForClick(driver, buttonPlus, 5);
                buttonPlus.click();
            }
 
             public void delOne(){
                waitForClick(driver, buttonMinus, 5);
            }
 }