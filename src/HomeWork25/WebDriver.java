package HomeWork25;

public interface WebDriver {
    /*Create a WebDriver Interface that will have the following
    unimplemented behaviour: openBrowser(), closeBrowser(),
    maximizeWindow(), findElement().
    Create 2 classes that implements WebDriver interface:
    ChromeDriver and FirefoxDriver.
     */
    void openBrowser();
    void closeBrowser();
    void maximizeWindow();
    void findElement();
}
class ChromeDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("User open Chrome Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("User closed Chrome Browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("User maximize window in Chrome Browser");
    }

    @Override
    public void findElement() {
        System.out.println("User find the element in Chrome Browser");
    }
}
class FirefoxDriver implements WebDriver{

    @Override
    public void openBrowser() {
        System.out.println("User open Firefox Browser");
    }

    @Override
    public void closeBrowser() {
        System.out.println("User closed Firefox Browser");
    }

    @Override
    public void maximizeWindow() {
        System.out.println("User maximize window in Firefox Browser");
    }

    @Override
    public void findElement() {
        System.out.println("User find the element in Firefox Browser");
    }
}
class WebDriverTester{
    public static void main(String[] args) {
        WebDriver [] arr={new ChromeDriver(),new FirefoxDriver()};
        for(WebDriver x:arr){
            x.closeBrowser();
            x.findElement();
            x.maximizeWindow();
            x.openBrowser();
        }
    }
}
