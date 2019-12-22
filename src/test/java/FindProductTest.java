
import com.kilinochi.page.product.ProductMainPage;
import com.kilinochi.page.product.ProductsListPage;
import org.junit.Assert;
import org.junit.Test;

import static com.codeborne.selenide.Selenide.sleep;

public final class FindProductTest extends BaseTest {

    @Test
    public void createWork() {

        final ProductMainPage productMainPage = userPage.productMainPage();
        final ProductsListPage productsListPage = productMainPage.findProduct("USB");
        int bCount = productsListPage.getCount();
        sleep(2000);
        Assert.assertTrue(bCount > 0 );
        final ProductsListPage p = productsListPage.
                setPrice(200).
                sortingPrice("PRICE_ASC");
        sleep(2000);
        int eCount = p.getCount();
        Assert.assertTrue("Error "+bCount+" "+eCount, bCount != eCount );
    }
}
