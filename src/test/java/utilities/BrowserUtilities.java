package utilities;

public class BrowserUtilities {

    // we store only common useful methods which we can reuse in pages folder, tests folder
    // (basically anywhere within this project)

    // this method of Thread.sleep()
    public void wait(int seconds) {
        try {
            // if you want to wait 5 seconds 5 * 1000 = 5000
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // this method will navigate to the URL which I want to
    public void goToURL(String url){
        Driver.getDriver().navigate().to(url);
    }



}
