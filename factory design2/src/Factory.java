public class Factory {
    public  static Vehicle show(String msg){
        if(msg.equalsIgnoreCase("bike"))
        {
            return new Bike();
        }
        if(msg.equalsIgnoreCase("Car")) {
            return new Car();
        }
        return null;

    }
}
