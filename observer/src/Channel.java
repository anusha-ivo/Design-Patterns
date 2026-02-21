public class Channel  {
    User u;
    Channel(User u){
        this.u=u;
    }
    public void show(){
        u.notify("get notified");
    }


}
