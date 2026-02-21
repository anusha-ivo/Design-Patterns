//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         Factory f =new Casualfactory();
         Shirt s =f.wearshirt();
         Pant p =f.wearpant();
         s.wear();
         p.wear();




    }
}