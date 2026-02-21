public class Casualfactory implements Factory{
    public Shirt wearshirt(){
        return new Casualshirt();
    }
    public Pant wearpant(){
        return new CasualPant();
    }
}
