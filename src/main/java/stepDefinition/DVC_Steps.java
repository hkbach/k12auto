//package stepDefinition;
//
//import cucumber.api.PendingException;
//import cucumber.api.java.en.And;
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//import org.junit.Assert;
//import pageObjects.DVC;
//import utils.libs.TestBase;
//
//public class DVC_Steps extends TestBase {
//    DVC dvc = new DVC(driver);
//
//    public DVC_Steps() {
//    }
//
//    @Given("User goes to the DVC page")
//    public void UsergoestotheDVCpage() throws Throwable {
//        String url = "https://dichvucong.gov.vn/";
//        driver.get(url);
//    }
//
//    @When("^User input keyword as \"([^\"]*)\"$")
//    public void userInputKeywordAs(String keyword) throws Throwable {
//        String keywordvalue = keyword;
//        dvc.txt_search().sendKeys(keywordvalue);
//    }
//
//    @And("^User click 'Search' button$")
//    public void userClickSearchButton() {
//        dvc.btn_search().click();
//    }
//
//    @Then("^The expected articles will be displayed screen$")
//    public void theExpectedArticlesWillBeDisplayedScreen() {
//        int TotalRowArticlesLastpage = 0;
//        int TotalPage = 0;
//        int TotalResult = 0;
//        int ToTalArticles = 0;
//        int expected = 0;
//        int actual = 0;
//        String ElementAttribute = "";
//        // đếm số bài viết ở trang cuối cùng
//        dvc.btn_lastPage().click();
//        TotalRowArticlesLastpage = dvc.list_articles().size();
//        System.out.println("Trang cuoi co: " + dvc.list_articles().size());
//
//
//        // chuyển text "96" từ kiểu string thành kiểu int
//        TotalResult = Integer.parseInt(dvc.lbl_totalResults().getText());
//        expected = TotalResult;
//
//        // đếm tổng số trang (có 10 trang)
//        ElementAttribute = dvc.btn_lastPage().getAttribute("jp-data");
//        TotalPage = Integer.parseInt(ElementAttribute);
//
//        ToTalArticles = (TotalPage - 1) * 10;
//
//        actual = ToTalArticles + TotalRowArticlesLastpage;
//        Assert.assertEquals(expected, actual);
//    }
//
//
//    @Then("^check articles specific$")
//    public void checkArticlesSpecific() {
//        String elemenatttribute = "";
//        int TotalPage = 0;
//        int TotalRowOfPage = 0;
//        String expected = "Thủ tục tiếp công dân tại cấp tỉnh";
//        String actual = "";
//        int count = 0;
//        dvc.btn_firstpage().click();
//        // đếm tổng số trang
//        elemenatttribute = dvc.btn_lastPage().getAttribute("jp-data");
//        TotalPage = Integer.parseInt(elemenatttribute);
//
//
//        // for ( điều kiện bắt đầu (số nguyên); điều kiện kết thúc; tăng giá trị cho biến đếm )
//        for (int page = 1; page <= TotalPage; page++) {
//            // Đếm số lượng bài viết mỗi trang
//            TotalRowOfPage = dvc.list_articles().size();
//            // Kiểm tra danh sách bài viết mỗi trang
//            for (int row = 1; row <= TotalRowOfPage; row++) {
//                actual = dvc.lbl_articles_title(row).getText();
//                // Kiểm tra so sánh với điều kiện (Equals là so sánh điều kiện với nhau)
//                if (actual.equals(expected)) {
//                    System.out.println("Trang so: " + page);
//                    System.out.println("Dong so: " + row);
//                    count = count + 1;
//                }
//            }
//            dvc.btn_nextPage().click();
//        }
//        if (count > 1){
//            System.out.println("Trung bai");
//        }
//    }
//}
////
////
