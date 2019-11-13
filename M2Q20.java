import java.util.Scanner;
public class M2Q20{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        boolean bln = true;
        int j=2;
        for(int i=2;i<n;i++){
            if(i%j==0){
                bln = false;
            }
             
        }
        
    }
}