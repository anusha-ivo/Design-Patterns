import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("enter string");
        String s1=s.next();
        String rev=" ";
        for(int i=s1.length()-1;i>=0;i--){
            rev=rev+s1.charAt(i);


        }
        System.out.println(rev);
        StringBuffer s2=new StringBuffer("anu");
        s2.reverse();
        System.out.println(s2);

    }
}