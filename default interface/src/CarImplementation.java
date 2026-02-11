public class CarImplementation implements Car{
    @Override
    public void drive() {
        System.out.println("car is driving which is car implementation class");
        Car.super.drive();
    }
}
