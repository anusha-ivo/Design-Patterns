public interface Car {
    default void drive(){
        System.out.println("car started");
    }
    default void engine(){

    }
}
