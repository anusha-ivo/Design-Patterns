public class Fan {
    State s=new Offset();
    void setState(State s){
        this.s=s;
    }
    void pressButton(){
        s.pressButton(this);
    }
}
