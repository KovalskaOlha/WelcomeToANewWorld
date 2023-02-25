package class29;

public interface WebDriver {
}
interface ScreenShot {
    void method1();

}
interface RemoteWebDriver extends ScreenShot, WebDriver {
}

class ChromeDriver implements RemoteWebDriver{

    @Override
    public void method1() {
        System.out.println("implementation");
    }
}