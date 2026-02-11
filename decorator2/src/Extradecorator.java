public class Extradecorator extends Decorator{
    Extradecorator(Dress d){
        super(d);
    }
    public boolean wear(){
        System.out.println(d.wear()+" "+"extra decoartor");//btr use return type rather than s.o.p
        return false;
    }
}
