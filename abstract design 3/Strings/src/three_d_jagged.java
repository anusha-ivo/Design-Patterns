import java.util.Scanner;

public class three_d_jagged {
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        int[][][] a=new int[2][][];
        System.out.println("enter rows");
        for(int i=0;i<a.length;i++){
              a[i]=new int[s.nextInt()][];
        }
        System.out.println("enter colums");
        for(int i=0;i<a.length;i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j]=new int[s.nextInt()];
            }
        }
        System.out.println("enter elements");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                for(int k=0;k<a[i][j].length;k++){
                    a[i][j][k]=s.nextInt();
                }
            }
        }
        System.out.println("the elements are");
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a[i].length;j++){
                for(int k=0;k<a[i][j].length;k++){
                  System.out.println(a[i][j][k]);
                }
            }
        }


    }
}
