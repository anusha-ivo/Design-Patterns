public class Browser {
    private Browser(){

    }
    private static Browser browser;
    public static Browser getBrowser(){
        if(browser==null){
            browser=new Browser();
        }
        return browser;
    }
    public void dis(){
        System.out.println("this is browser singleton");
    }

}
