//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Prototypecls p=new Prototypecls("anu");
        Prototypecls pw = p.clone();
        pw.setAge(23);
        pw.show();

    }
}