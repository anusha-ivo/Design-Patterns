//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
         Factory f =new FactoryTesting();
        Developer d = f.devtest();
       Tester t = f.testing();
       d.work();
       t.work();

    }
}