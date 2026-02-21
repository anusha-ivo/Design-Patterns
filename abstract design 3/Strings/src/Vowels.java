import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter string");
        String s2 = s.next();
        String v = "aeiou";
        int vowels = 0;
        int cons=0;
        for (int i = 0; i < s2.length(); i++) {
            char c = s2.charAt(i);
            if (v.indexOf(c) != -1) {
                vowels++;
            }



            if (c >= 'a' || c <= 'z' && c>='A'|| c<='Z'){
                 cons++;
            }

        }
        System.out.println(vowels);
        System.out.println(cons);

    }
}
