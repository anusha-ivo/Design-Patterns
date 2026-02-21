public class Decorator implements Message{
    public Message m;
    Decorator(Message m){
        this.m=m;
    }
    public String getmsgs(){
        return m.getmsgs();
    }

}
