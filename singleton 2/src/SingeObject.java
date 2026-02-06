public class SingeObject {
    SingeObject(){
    }
    private static SingeObject singeObject;
    public  static SingeObject get(){
        if(singeObject==null){
            return new SingeObject();

        }
        return singeObject;
    }
    public void dis(){
        System.out.println("singleton");
    }

}
