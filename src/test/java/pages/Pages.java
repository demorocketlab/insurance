/* denislitvinenko created on 24.01.2025 inside the package - pages */

package pages;

import com.intuit.karate.driver.Driver;
import pages.home.HomePage;

public class Pages {
    public HomePage homePage;

    public Pages(Object driverObj) {
        homePage = new HomePage((Driver) driverObj);
    }
}
