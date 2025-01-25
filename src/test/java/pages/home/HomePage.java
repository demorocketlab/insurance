/* denislitvinenko created on 23.01.2025 inside the package - pages */

package pages.home;

import com.intuit.karate.driver.Driver;
import pages.BasePage;

public class HomePage extends BasePage {
    private String acceptAll = "//button/div[contains(text(),'Accept all')]";
    private String searchInput = "textarea[name=q]";
    private String submitButton = "input[name=btnK]";

    public HomePage(Driver driverObj) {
        this.driver = driverObj;
    }

    public void acceptAllConsents() {
        driver.waitFor(acceptAll).click();
    }

    public void inputSearchWords(String text) {
        driver.input(searchInput, text);
        driver.click(submitButton);
    }
}
