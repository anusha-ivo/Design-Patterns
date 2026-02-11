public class Adaptor implements Charger{
    private Oldcharger o;
    Adaptor(Oldcharger o){
        this.o=o;
    }

    @Override
    public void charge() {
        o.old();
    }
}
