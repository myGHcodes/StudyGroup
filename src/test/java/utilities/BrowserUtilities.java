package utilities;

public class BrowserUtilities {

    // common useful methods

    public void wait(int seconds) {
        try {
            // if you want to wait 5 seconds 5 * 1000 = 5000
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
