package testngtopics;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Topic08_ParametersFromXml {

    // Values for these method arguments come from testng.xml or another suite XML file.
    @Test
    @Parameters({"baseUrl", "username", "password"})
    public void webLogin(String baseUrl,
                         @Optional("default_user") String username,
                         @Optional("default_pass") String password) {
        // TestNG injects the XML parameter values into this method.
        System.out.println("Base URL: " + baseUrl);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}
