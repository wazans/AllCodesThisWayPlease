package testngtopics;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Topic09_DataProviderWithoutExcel {

    // This single test method will run once for every row returned by the data provider.
    @Test(dataProvider = "loginData")
    public void login(String username, String password) {
        System.out.println("Username: " + username + ", Password: " + password);
    }

    // DataProvider returns test data in rows and columns.
    // Each row becomes one test run.
    @DataProvider(name = "loginData")
    public Object[][] passData() {
        return new Object[][]{
                {"u1", "p1"},
                {"u2", "p2"},
                {"u3", "p3"}
        };
    }
}
