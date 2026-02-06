//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employe e=new Employe("anu",22);
        Employe e2 =e.clone();
        e2.setDpt("it");
        e2.show();
        e.show();

    }
}