package Elements;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Html_label extends Element{

    public Html_label(WebElement elem){
        super(elem);
    }

    private String getLink(){
        return getAttribute("href");
    }

    public boolean isCorrect(WebDriver driver){
        String link = getLink();
        click();
        return driver.getCurrentUrl().equals(link);
    }
}
