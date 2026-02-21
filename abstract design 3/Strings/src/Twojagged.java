import java.util.Scanner;

public class Twojagged {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int[][] a=new int[2][];
        System.out.println("enter colums");
        for(int i=0;i<a.length;i++){
            a[i]=new int[sc.nextInt()];
        }
        System.out.println("enter elements");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println(" elements are");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                System.out.println(a[i][j]);
            }
        }
    }
}
