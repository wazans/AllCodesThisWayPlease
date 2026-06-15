package testngtopics;

import org.testng.annotations.Test;

public class Topic03_TestNgXmlAndIgnoringTests {

    // This method can be included from XML using its method name.
    @Test
    public void xmlCaseOne() {
        System.out.println("xmlCaseOne valid user name1 and password1 executed from TestNG XML.");
    }

    // This method can also be included or excluded from XML.
    @Test
    public void xmlCaseTwo() {
        System.out.println("xmlCaseTwo valid valid user name2 and password2 executed from TestNG XML.");
    }

    // You can exclude this from a suite file using the <exclude> tag.
    @Test
    public void xmlCaseThree() {
        System.out.println("xmlCaseThree invalid cred executed unless excluded in suite XML.");
    }

    // enabled = false means TestNG will skip this test completely.
    @Test(enabled = false)
    public void ignoredByEnabledFalse() {
        System.out.println("This line should never print because enabled is false.");
    }
}
