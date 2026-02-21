public class OnState implements State{
    public void pressButton(Fan fan){
        System.out.println("fan turned off");
        fan.setState(new OnState());
    }
}
