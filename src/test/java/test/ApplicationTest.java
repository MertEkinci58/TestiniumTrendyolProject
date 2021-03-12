package test;
import com.example.base.BaseTest;
import com.example.pages.HomePage;
import com.example.pages.ProductPage;
import com.example.pages.ChartPage;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ApplicationTest extends BaseTest {

    HomePage homePage;
    ProductPage productPage;
    ChartPage chartPage;

    @Before
    public void before(){
        homePage = new HomePage(getWebDriver());
        productPage = new ProductPage(getWebDriver());
        chartPage = new ChartPage(getWebDriver());
    }

    @Test
    public void test(){
        homePage.openHomePage()
                .hoverManPicture()
                .clickManPicture()
                .manPictrueSelectionControl()
                .writeTheProductToSearch()
                .clickSearchButton();
        productPage.selectLogitechBrand()
                .clickOnSuggestedRanking()
                .selectPriceByAsc()
                .clickLowestPriceProductOfLogitech()
                .scrollDownToProductReview()
                .getNumberOfReviews()
                .getNumberOfComments()
                .closeSecondTab()
                .deSelectLogitechBrand()
                .selectA4TechBrand()
                .clickLowestPriceProductOfA4Tech()
                .scrollDownToProductComments()
                .getFirstCommentOfProduct();
        chartPage.scrollUpToAddToChart()
                .clickAddToChart()
                .hoverToMyChart()
                .goToChart()
                .incChartProductCountByOne()
                .deleteProductFromChart()
                .confirmDeleteProductFromChart();
    }

    @After
    public void after(){
        getWebDriver().quit();
    }

}
