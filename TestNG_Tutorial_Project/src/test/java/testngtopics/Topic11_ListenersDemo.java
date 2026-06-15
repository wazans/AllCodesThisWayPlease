package testngtopics;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import testngtopics.listeners.Topic11_TestListener;

@Listeners(Topic11_TestListener.class)
public class Topic11_ListenersDemo {

    // This test passes and the listener will report success.
    @Test
    public void passingTest() {
        System.out.println("Passing test executed.");
    }

    // This test fails on purpose so you can see listener failure callbacks.
    @Test
    public void failingTest() {
        Assert.fail("Intentional failure to show listener callbacks.");
    }
}
