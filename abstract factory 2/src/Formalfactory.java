public class Formalfactory implements Factory{
     public Shirt wearshirt(){
        return new Formalshirt();
    }
    public Pant wearpant(){
         return new ForamlPant();
    }
}
