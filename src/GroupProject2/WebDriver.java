package GroupProject2;

public interface WebDriver {
    void open();
    void close();
    String getTitle();

}
interface RemoteWebDriver{
void navigate();
}
interface TakesScreenshot{
void getScreenshot();
}

class ChromeDriver implements WebDriver, RemoteWebDriver, TakesScreenshot{
private String title;
    @Override
    public void open() {
        System.out.println("User open Chrome");
    }

    @Override
    public void close() {
        System.out.println("User close Chrome");
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void navigate() {
        System.out.println("Chrome User navigate to Remote Web Driver");
    }

    @Override
    public void getScreenshot() {
        System.out.println("User make a screenshot");
    }
}
class FireFoxDriver implements WebDriver,RemoteWebDriver,TakesScreenshot{
String title;
    @Override
    public void open() {
        System.out.println("User open FireFox");
    }

    @Override
    public void close() {
        System.out.println("User close Firefox");
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void navigate() {
        System.out.println("FireFox user navigate to Remote Web Driver");
    }

    @Override
    public void getScreenshot() {
        System.out.println("User make a screenshot");
    }
}
class SafariDriver implements WebDriver,RemoteWebDriver,TakesScreenshot{
String title;
    @Override
    public void open() {
        System.out.println("User open Safari");
    }

    @Override
    public void close() {
        System.out.println("User close Safari");
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void navigate() {
        System.out.println("Safari user navigate to Remote Web Driver");
    }

    @Override
    public void getScreenshot() {
        System.out.println("User make a screenshot");
    }
}
class WebDriverTester{
    public static void main(String[] args) {
       WebDriver [] wd={new ChromeDriver(),new FireFoxDriver(),new SafariDriver()};
        for(WebDriver x:wd){
            x.close();
            x.getTitle();
            x.open();
        }
        ChromeDriver cd=new ChromeDriver();
        cd.getScreenshot();
        cd.navigate();
        cd.open();
        cd.close();
        cd.getTitle();

    }
}