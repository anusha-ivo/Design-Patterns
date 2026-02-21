import java.util.Scanner;

public class Sum {

    public static void main(String[] args){
        int s=0;
        Scanner sc=new Scanner(System.in);
        int[] a=new int[3];
        for(int i=0;i<a.length;i++){
            a[i]=sc.nextInt();
            s=s+a[i];

        }
        System.out.println(s);
        int min=a[0];
        for(int i=0;i<a.length;i++){
            if(a[i]<min){
                min=a[i];
            }

        }
        System.out.println(min);
        int max=a[0];
        for(int i=0;i<a.length;i++){

            if(a[i]>max){
                max=a[i];
            }

        }
        System.out.println(max);




    }
}
