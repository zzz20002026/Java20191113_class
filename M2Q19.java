import java.util.Scanner;
public class M2Q19{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int N = scn.nextInt();
        int i=1 , j=1;
        while(i<=N){
            System.out.print(i+"\t");
            i = i+j;
            j++;
        }
        System.out.println(i);
        i=1;
        while(i<=N+1){
            for(int k=1;k<=i;k++){
                System.out.print(i+"\t");
            }
            i++;
        }
        System.out.print("\n");
    }
}
