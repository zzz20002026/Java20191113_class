import java.util.Scanner;
import java.math.BigInteger;
public class M2Q21{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        BigInteger sum = new BigInteger("1");
        int k=0;
        for(int i=1;i<=n;i++){
            sum = sum.multiply(new BigInteger(Integer.toString(i)));
        }
        while(sum.mod(new BigInteger("10")).intValue()==0){
            k = k+1;
            sum = sum.divide(new BigInteger("10")); 
        }
        System.out.println(k);
    }
}