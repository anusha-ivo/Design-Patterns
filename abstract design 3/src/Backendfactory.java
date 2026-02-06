public class Backendfactory implements Factory{
    public Developer devtest(){
        return new Frontenddev();
    }
    public Tester testing(){
        return new FrontendTest();
    }

}
