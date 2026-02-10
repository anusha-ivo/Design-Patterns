public class CustomExceptions {
    public static void main(String[] args) {
        Model m = new Model();
        try{
            m.check();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}

class MyOwnException extends Exception
{
    MyOwnException(String msg){
        super(msg);
    }

}
class Model{
    int age=12;
    void check() throws Exception {
        if(age<18){
            throw new MyOwnException("not valid ");

        }
        else{
            System.out.println("valid");
        }
    }


}