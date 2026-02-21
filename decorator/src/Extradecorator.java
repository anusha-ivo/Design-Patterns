public class Extradecorator extends Decorator{
    Extradecorator(Message m){
        super(m);
    }
    public String getmsgs(){
        return m.getmsgs()+"hello";
    }
}
