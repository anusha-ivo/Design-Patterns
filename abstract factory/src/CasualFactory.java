public class CasualFactory implements Factory{
    public Shirt wearshirt(){
        return new CasualShirt();
    }
    public Pant wearpant(){
        return new CasualPant();
    }
}
