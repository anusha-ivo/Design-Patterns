public class Count {
    public static void main(String[] args){
        String s2="anusha";
        int wc=0;
        int count=0;
        String rev="";
        for(int i=0;i<s2.length();i++){
            count++;

        }
        System.out.println(count);
        String s="java is great";
        String[] sp=s.split("\\s");
        for(String sp2:sp){
            wc++;

            System.out.println(sp2);
        }
        System.out.println(wc);
        System.out.println("---------");
for(int i=sp.length-1;i>=0;i--){
        rev=rev+sp[i]+" ";
}
System.out.println(rev);


    }
}
