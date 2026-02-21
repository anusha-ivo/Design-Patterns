public class Removeduplicates {
    public static void main(String[] args){
        String s="anush is  anusha";
        String rev=" ";
        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if (rev.indexOf(c) == -1) {
                rev = rev + c;
            }
        }
            System.out.println(rev);


    }
}
