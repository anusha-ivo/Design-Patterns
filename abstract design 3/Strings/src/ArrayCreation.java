import java.util.Scanner;

public class ArrayCreation {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter array size");
        int a=sc.nextInt();
        int[] array=new int[a];
        for(int i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        for(int i=0;i<array.length;i++) {
            System.out.println(array[i]);
        }
        for(int ar:array){
            System.out.println(ar);
        }


    }
}
