public class FactoryTesting implements Factory{
    public Tester testing(){
        return new FrontendTest();
    }
    public Developer devtest(){
        return new Frontenddev();
    }
}
