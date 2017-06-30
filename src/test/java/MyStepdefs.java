import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs {
    @When("^不设置命名空间环境变量创建客户端$")
    public void 不设置命名空间环境变量创建客户端() throws Throwable {
        System.out.println("11111111111111");
    }

    @Then("^客户端抛出无效配置异常$")
    public void 客户端抛出无效配置异常() throws Throwable {
        System.out.println("11111111111111");
    }
}
