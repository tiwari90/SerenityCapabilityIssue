package util;

import net.serenitybdd.core.webdriver.enhancers.BeforeAWebdriverScenario;
import net.thucydides.core.model.TestOutcome;
import net.thucydides.core.util.EnvironmentVariables;
import net.thucydides.core.webdriver.SupportedWebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.HashMap;
import java.util.Map;

public class CustomCapabilities implements BeforeAWebdriverScenario {

    @Override
    public DesiredCapabilities apply(EnvironmentVariables environmentVariables,
        SupportedWebDriver driver, TestOutcome testOutcome, DesiredCapabilities capabilities) {
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("profile.default_content_settings.popups", 0);
        prefs.put("download.prompt_for_download", "false");
        prefs.put("plugins.plugins_disabled", new String[] {"Adobe Flash Player"});
        prefs.put("plugins.always_open_pdf_externally", true);
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.setExperimentalOption("prefs", prefs);
        chromeOptions.addArguments("--disable-gpu");
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("use-fake-device-for-media-stream");
        chromeOptions.addArguments("use-fake-ui-for-media-stream");
        capabilities.setCapability(ChromeOptions.CAPABILITY, chromeOptions);
        capabilities.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
        return capabilities;
    }
}
