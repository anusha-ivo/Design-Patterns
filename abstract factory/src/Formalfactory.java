public class Formalfactory implements Factory{
    public Shirt wearshirt(){
        return new FormalShirt();
    }
    public Pant wearpant(){
        return new FormalPant();
    }
}
