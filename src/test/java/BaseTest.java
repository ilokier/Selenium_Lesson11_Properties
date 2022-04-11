import Configuration.BrowserEnvironment;
import Configuration.EnvironmentProperty;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseTest {
    private static Logger log = LoggerFactory.getLogger("BaseTest.class");
    protected static WebDriver driver;
    private static BrowserEnvironment browserEnvironment;
    protected static EnvironmentProperty environmentProperty;

    @BeforeAll
    static void beforeAll() {
        environmentProperty = EnvironmentProperty.getInstance();
        browserEnvironment = new BrowserEnvironment();
        driver = browserEnvironment.getDriver();
    }

    @AfterAll
    static void quit() {
        driver.quit();
        log.debug("<<<<<<driver closed properly>>>>>");
    }
}
