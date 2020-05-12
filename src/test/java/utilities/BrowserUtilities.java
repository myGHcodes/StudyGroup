package utilities;

public class BrowserUtilities {

    // common useful methods

    public void wait(int seconds) {
        try {
            Thread.sleep(seconds);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}