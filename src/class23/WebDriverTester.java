package class23;

public class WebDriverTester {
    public static void main(String[] args) {
        /*  WebDriver webDriver = new Chrome();// up casting
        FireFox fireFox=new WebDriver(); down casting
        //create a variable of parent class
        //if we change Chrome to Safari we receive all methods from Safari class
        webDriver.startBrowser();
        webDriver.openURL();
        webDriver.testLoginPage();
        webDriver.closeBrowser();
        //child class variable can NOT hold the obj of parent
        //an Array of parent class can hold the objects of child class*/

        WebDriver [] browsers={new Chrome(),new Safari(),new FireFox()}; //WebDriver -the parent class will be able to hold of obj of any child classes
        for(WebDriver x:browsers){
            x.startBrowser();
            x.openURL();
            x.testLoginPage();
            x.closeBrowser();
        }


    }
}
