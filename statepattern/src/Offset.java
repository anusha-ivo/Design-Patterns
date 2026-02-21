public class Offset implements State{
    public void pressButton(Fan fan){
        System.out.println("fan turned on");
        fan.setState(new OnState());
    }
}
