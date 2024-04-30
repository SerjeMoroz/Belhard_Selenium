import org.junit.platform.suite.api.ConfigurationParameter;
import org.junit.platform.suite.api.SelectClasspathResource;
import org.junit.platform.suite.api.Suite;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static io.cucumber.core.options.Constants.GLUE_PROPERTY_NAME;


@Suite
@SelectClasspathResource("features")
@ConfigurationParameter(key = GLUE_PROPERTY_NAME, value = "en.ru.stqa.litecart.steps")
public class CucumberRunnerTest {
    private static final Logger logger = LoggerFactory.getLogger(CucumberRunnerTest.class);
}