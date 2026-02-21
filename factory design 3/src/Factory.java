public class Factory {
    public static Person show(String msg){
        if(msg.equalsIgnoreCase("docter")){
            return new Docter();
        }
        if(msg.equalsIgnoreCase("student")){
            return new Student();
        }
        return null;
    }
}
